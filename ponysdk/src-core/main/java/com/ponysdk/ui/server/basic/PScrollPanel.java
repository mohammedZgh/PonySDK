/*
 * Copyright (c) 2011 PonySDK
 *  Owners:
 *  Luciano Broussal  <luciano.broussal AT gmail.com>
 *	Mathieu Barbier   <mathieu.barbier AT gmail.com>
 *	Nicolas Ciaravola <nicolas.ciaravola.pro AT gmail.com>
 *  
 *  WebSite:
 *  http://code.google.com/p/pony-sdk/
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ponysdk.ui.server.basic;

import com.ponysdk.core.stm.Txn;
import com.ponysdk.ui.terminal.WidgetType;

/**
 * A simple panel that wraps its contents in a scrollable area.
 */
public class PScrollPanel extends PSimplePanel {

    @Override
    protected WidgetType getWidgetType() {
        return WidgetType.SCROLL_PANEL;
    }

    public void setHorizontalScrollPosition(final int position) {
        final Update update = new Update(ID);
        update.put(PROPERTY.HORIZONTAL_SCROLL_POSITION, position);
        Txn.get().getTxnContext().save(update);
    }

    public void scrollToBottom() {
        scrollTo(0);
    }

    public void scrollToLeft() {
        scrollTo(1);
    }

    public void scrollToRight() {
        scrollTo(2);
    }

    public void scrollToTop() {
        scrollTo(3);
    }

    private void scrollTo(final int type) {
        final Update update = new Update(ID);
        update.put(PROPERTY.SCROLL_TO, type);
        Txn.get().getTxnContext().save(update);
    }
}
