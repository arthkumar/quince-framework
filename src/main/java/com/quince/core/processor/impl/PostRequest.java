package com.quince.core.processor.impl;

import com.quince.core.builder.RequestBuilder;
import com.quince.core.processor.internal.IPostRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest implements IPostRequest {
    @Override
    public Response process(RequestBuilder requestBuilder) {
        return RestAssured.given()
                .body(requestBuilder.getRequestBody())
                .headers(requestBuilder.getHeader())
                .accept(requestBuilder.getContentType())
                .contentType(requestBuilder.getContentType())
                .post(requestBuilder.getEndpoint());
    }
}
