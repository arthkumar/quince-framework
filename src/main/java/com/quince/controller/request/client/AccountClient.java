package com.quince.controller.request.client;

import com.quince.core.builder.RequestBuilder;
import com.quince.core.processor.impl.PostRequest;
import io.restassured.response.Response;

public class AccountClient {
    public Response userClient(RequestBuilder requestBuilder){
        return new PostRequest().process(requestBuilder);
    }

    public Response generateToken(RequestBuilder requestBuilder){
        return new PostRequest().process(requestBuilder);
    }
}
