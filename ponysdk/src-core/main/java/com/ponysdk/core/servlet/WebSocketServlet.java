
package com.ponysdk.core.servlet;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketListener;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse;
import org.eclipse.jetty.websocket.servlet.WebSocketCreator;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ponysdk.core.Application;
import com.ponysdk.core.UIContext;
import com.ponysdk.core.socket.ConnectionListener;
import com.ponysdk.ui.server.basic.PPusher;
import com.ponysdk.ui.terminal.model.Model;

public class WebSocketServlet extends org.eclipse.jetty.websocket.servlet.WebSocketServlet {

    protected static final Logger log = LoggerFactory.getLogger(WebSocketServlet.class);

    private static final long serialVersionUID = 1L;

    public int maxIdleTime = 1000;

    @Override
    public void configure(final WebSocketServletFactory factory) {
        factory.getPolicy().setIdleTimeout(maxIdleTime);
        factory.setCreator(new MySessionSocketCreator());
    }

    public class MySessionSocketCreator implements WebSocketCreator {

        @Override
        public Object createWebSocket(final ServletUpgradeRequest req, final ServletUpgradeResponse resp) {
            return new JettyWebSocket(req, resp);
        }
    }

    public class JettyWebSocket implements WebSocketListener, com.ponysdk.core.socket.WebSocket {

        private Session session;

        private final long key;

        private final HttpSession httpSession;

        private UIContext uiContext;

        private ConnectionListener listener;

        private final ByteBuffer buffer = ByteBuffer.allocateDirect(1000000);

        public JettyWebSocket(final ServletUpgradeRequest req, final ServletUpgradeResponse resp) {
            final Map<String, List<String>> parameterMap = req.getParameterMap();
            this.key = Long.parseLong(parameterMap.get(Model.APPLICATION_VIEW_ID.getKey()).get(0));
            this.httpSession = req.getSession();
        }

        @Override
        public void close() {}

        @Override
        public void flush() {
            // onBeforeSendMessage();
            try {
                if ((session != null) && (session.isOpen())) {
                    session.getRemote().sendBytes(buffer); // callback needed ?
                } else {
                    // ??
                }
            } catch (final Throwable t) {
                log.error("Cannot flush to WebSocket", t);
            } finally {
                // onAfterMessageSent();
            }
        }

        @Override
        public void addConnectionListener(final ConnectionListener listener) {
            this.listener = listener;
        }

        @Override
        public void onWebSocketClose(final int arg0, final String arg1) {
            listener.onClose();
        }

        @Override
        public void onWebSocketConnect(final Session session) {
            this.session = session;

            final Application applicationSession = (Application) httpSession.getAttribute(Application.class.getCanonicalName());
            if (applicationSession == null) throw new RuntimeException("Invalid session, please reload your application");

            uiContext = applicationSession.getUIContext(key);
            uiContext.acquire();
            try {
                UIContext.setCurrent(uiContext);

                session.getRemote().sendBytes(buffer);

                PPusher.get().initialize(this);
            } catch (final IOException e) {
                log.error("Cannot initializing Web Socket", e);
            } finally {
                UIContext.remove();
                uiContext.release();
            }

            listener.onOpen();
        }

        @Override
        public void onWebSocketError(final Throwable throwable) {
            log.error("WebSoket Error", throwable);
        }

        @Override
        public void onWebSocketBinary(final byte[] arg0, final int arg1, final int arg2) {}

        @Override
        public void onWebSocketText(final String text) {
            onBeforeMessageReceived(text);
            try {
                uiContext.notifyMessageReceived();
            } catch (final Throwable e) {
                log.error("", e);
            } finally {
                onAfterMessageProcessed(text);
            }
        }

        protected void onBeforeSendMessage(final String msg) {}

        protected void onAfterMessageSent(final String msg) {}

        protected void onBeforeMessageReceived(final String text) {}

        protected void onAfterMessageProcessed(final String text) {}

        @Override
        public ByteBuffer getByteBuffer() {
            return buffer;
        }

    }

    public void setMaxIdleTime(final int maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

}
