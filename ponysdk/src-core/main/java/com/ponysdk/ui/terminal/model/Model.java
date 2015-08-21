
package com.ponysdk.ui.terminal.model;

public enum Model {
    TYPE("1"), //
    APPLICATION_VIEW_ID("2"),
    OBJECT_ID("3"),
    PARENT_OBJECT_ID("4"),
    PUT_STYLE_KEY("5"),
    STYLE_VALUE("6"),
    REMOVE_STYLE_KEY("7"),
    PUT_PROPERTY_KEY("8"),
    PROPERTY_VALUE("9"),
    PUT_ATTRIBUTE_KEY("10"),
    ATTRIBUTE_VALUE("11"),
    REMOVE_ATTRIBUTE_KEY("12"),
    PREVENT_EVENT("13"),
    STOP_EVENT("14"),
    ADD_STYLE_NAME("15"),
    REMOVE_STYLE_NAME("16"),
    HREF("17"),
    TEXT("18"),
    HTML("19"),
    REPAINT("20"),
    WIDGET("21"),
    BORDER_WIDTH("22"),
    SPACING("23"),
    VALUE("24"),
    WORD_WRAP("25"),
    CLEAR("26"),
    CLEAR_ROW("27"),
    INSERT_ROW("28"),
    CELL_PADDING("29"),
    CELL_SPACING("30"),
    HORIZONTAL_ALIGNMENT("31"),
    VERTICAL_ALIGNMENT("32"),
    WIDGET_HIDDEN("33"),
    LEFT("34"),
    RIGHT("35"),
    WIDTH("36"),
    TOP("37"),
    BOTTOM("38"),
    HEIGHT("39"),
    UNIT("40"),
    ANIMATE("41"),
    NAME("42"),
    ANIMATION_DURATION("43"),
    OPEN("44"),
    IMAGE_URL("45"),
    NATIVE("46"),
    BIND("47"),
    CELL_HORIZONTAL_ALIGNMENT("48"),
    CELL("49"),
    CELL_VERTICAL_ALIGNMENT("50"),
    CELL_HEIGHT("51"),
    CELL_WIDTH("52"),
    INDEX("53"),
    REMOVE("54"),
    COOKIE_EXPIRE("55"),
    ADD("56"),
    MONTH("57"),
    ANIMATION("58"),
    MAX_LENGTH("59"),
    VISIBLE_LENGTH("60"),
    MASK("61"),
    VISIBILITY("62"),
    REPLACEMENT_STRING("63"),
    DATE_FORMAT_PATTERN("64"),
    TAG("65"),
    INNER_HTML("66"),
    INNER_TEXT("67"),
    PICKER("68"),
    ROW("69"),
    HTMLTABLE_ROW_STYLE("70"),
    ROW_FORMATTER_ADD_STYLE_NAME("71"),
    ROW_FORMATTER_REMOVE_STYLE_NAME("72"),
    ROW_FORMATTER_SET_STYLE_NAME("73"),
    COLUMN("74"),
    CELL_FORMATTER_ADD_STYLE_NAME("75"),
    HTMLTABLE_CELL_STYLE("76"),
    CELL_FORMATTER_REMOVE_STYLE_NAME("77"),
    CELL_FORMATTER_SET_STYLE_NAME("78"),
    COLUMN_FORMATTER_COLUMN_WIDTH("79"),
    HTMLTABLE_COLUMN_STYLE("80"),
    COLUMN_FORMATTER_ADD_STYLE_NAME("81"),
    COLUMN_FORMATTER_REMOVE_STYLE_NAME("82"),
    COLUMN_FORMATTER_SET_STYLE_NAME("83"),
    PLACEHOLDER("84"),
    HANDLER_SELECTION_HANDLER("85"),
    HANDLER_DATE_VALUE_CHANGE_HANDLER("86"),
    HANDLER_BOOLEAN_VALUE_CHANGE_HANDLER("87"),

    TYPE_CREATE("100"),
    TYPE_UPDATE("200"),
    TYPE_GC("300"),
    TYPE_ADD("400"),
    TYPE_REMOVE("500"),
    TYPE_CLOSE("600"),
    TYPE_HISTORY("700"),
    TYPE_ADD_HANDLER("800"),
    TYPE_REMOVE_HANDLER("900"),
    TYPE_EVENT("1000"),
    DATE_ENABLED("88"),
    ENABLED("89"),
    ADD_DATE_STYLE("90"),
    STYLE_NAME("91"),
    REMOVE_DATE_STYLE("92"),
    HANDLER_KEY_SHOW_RANGE("93"),
    POPUP_CAPTION("94"),
    WIDGET_VISIBLE("95"),
    WIDGET_WIDTH("96"),
    WIDGET_HEIGHT("97"),
    WIDGET_TITLE("98"),
    STYLE_PRIMARY_NAME("99"),
    ENSURE_DEBUG_ID("101"),
    HANDLER_CHANGE_HANDLER("102"),
    ITEM_INSERTED("103"),
    ITEM_TEXT("104"),
    ITEM_UPDATED("105"),
    ITEM_REMOVED("106"),
    SELECTED_INDEX("107"),
    SELECTED("108"),
    MULTISELECT("109"),
    VISIBLE_ITEM_COUNT("110"),
    ITEM_ADD("111"),
    ITEM_GROUP("112"),
    POPUP_AUTO_HIDE("113"),
    POPUP_MODAL("114"),
    POPUP_GLASS_ENABLED("115"),
    POPUP_DRAGGABLE("116"),
    POPUP_CENTER("117"),
    POPUP_SHOW("118"),
    POPUP_HIDE("119"),
    POPUP_GLASS_STYLE_NAME("120"),
    POPUP_POSITION("121"),
    POPUP_POSITION_LEFT("122"),
    POPUP_POSITION_TOP("123"),
    HANDLER_POPUP_POSITION_CALLBACK("124"),
    IMAGE("125"),
    FIXDELAY("126"),
    PINGDELAY("127"),
    DISCLOSURE_PANEL_OPEN_IMG("128"),
    DISCLOSURE_PANEL_CLOSE_IMG("129"),
    MIN_SIZE("130"),
    SNAP_CLOSED_SIZE("131"),
    TOGGLE_DISPLAY_ALLOWED("132"),
    HANDLER_RESIZE_HANDLER("133"),
    HANDLER_COMMAND("134"),
    CREATE_LINK("135"),
    INSERT_HORIZONTAL_RULE("136"),
    INSERT_HTML("137"),
    ORDERED("138"),
    UNORDERED("139"),
    BACK_COLOR("140"),
    FONT_NAME("141"),
    FONT_SIZE("142"),
    FONT_COLOR("143"),
    JUSTIFICATION("144"),
    TOGGLE_BOLD("145"),
    TOGGLE_ITALIC("146"),
    TOGGLE_SUBSCRIPT("147"),
    TOGGLE_UNDERLINE("148"),
    LEFT_INDENT("149"),
    REDO("150"),
    REMOVE_FORMAT("151"),
    REMOVE_LINK("152"),
    TOGGLE_RIGHT_INDENT("153"),
    SELECT_ALL("154"),
    START("155"),
    COMMAND_ID("156"),
    FIXRATE("157"),
    STOP("158"),
    HANDLER_BEFORE_SELECTION_HANDLER("159"),
    ORACLE("160"),
    HANDLER_STRING_VALUE_CHANGE_HANDLER("161"),
    HANDLER_STRING_SELECTION_HANDLER("162"),
    STREAM_REQUEST_ID("163"),
    APPLICATION_PING("164"),
    ROOT("165"),
    STATE("166"),
    FACTORY("167"),
    DIRECTION("168"),
    SIZE("169"),
    WIDGET_SIZE("170"),
    RESIZE("171"),
    BEFORE_INDEX("172"),
    MENU_BAR_IS_VERTICAL("173"),
    TAB_WIDGET("174"),
    TAB_TEXT("175"),
    ENABLED_ON_REQUEST("176"),
    TABINDEX("177"),
    END_OF_PROCESSING("178"),
    FOCUSED("179"),
    DRAG_SRC("180"),
    HANDLER_DOM_HANDLER("181"),
    DOM_HANDLER_CODE("182"),
    IMAGE_TOP("183"),
    IMAGE_LEFT("184"),
    HISTORY_TOKEN("185"),
    HISTORY_FIRE_EVENTS("186"),
    APPLICATION_INSTRUCTIONS("187"),
    APPLICATION_ERRORS("188"),
    FILE_NAME("189"),
    HANDLER_SUBMIT_COMPLETE_HANDLER("190"),
    LOADING_ON_REQUEST("191"),
    YEAR("192"),
    DAY("193"),
    HANDLER_SHOW_RANGE("194"),
    END("195"),
    HANDLER_CLOSE_HANDLER("196"),
    HANDLER_OPEN_HANDLER("197"),
    FLEXTABLE_CELL_FORMATTER("198"),
    SET_COL_SPAN("199"),
    SET_ROW_SPAN("200"),
    HANDLER_STREAM_REQUEST_HANDLER("201"),
    HANDLER_EMBEDED_STREAM_REQUEST_HANDLER("202");

    String key;
    byte[] bytesKey;

    private Model(final String key) {
        this.key = key;
        this.bytesKey = key.getBytes();
    }

    public String getKey() {
        return key;
    }

    public byte[] getBytesKey() {
        return bytesKey;
    }
}
