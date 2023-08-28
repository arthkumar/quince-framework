package com.quince.controller.request.route;

public class AccountControllerEndpoints extends Base{
    private AccountControllerEndpoints(){}
    public static final String ACCOUNT_CONTROLLER = "/Account";
    public static final String USER = BASEURL.concat(ACCOUNT_CONTROLLER).concat("/v1/User");
    public static final String GENERATE_TOKEN = BASEURL.concat(ACCOUNT_CONTROLLER).concat("/v1/GenerateToken");
}
