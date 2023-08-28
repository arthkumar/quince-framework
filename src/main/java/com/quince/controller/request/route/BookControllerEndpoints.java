package com.quince.controller.request.route;

public class BookControllerEndpoints extends Base{

    private BookControllerEndpoints(){}
    public static final String BOOK_CONTROLLER = "/BookStore";
    public static final String BOOK = BASEURL.concat(BOOK_CONTROLLER).concat("/v1/Books");

}
