package com.quince.core.processor.impl;

import com.quince.core.builder.RequestBuilder;
import com.quince.core.processor.internal.IGetRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest implements IGetRequest {

    @Override
    public Response process(RequestBuilder requestBuilder) {
        return RestAssured.given().headers(requestBuilder.getHeader()).get(requestBuilder.getEndpoint());
    }
}
