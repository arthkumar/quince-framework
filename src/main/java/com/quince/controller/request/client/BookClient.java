package com.quince.controller.request.client;

import com.quince.core.builder.RequestBuilder;
import com.quince.core.processor.impl.GetRequest;
import com.quince.core.processor.impl.PostRequest;
import io.restassured.response.Response;

public class BookClient {
    public Response getBook(RequestBuilder requestBuilder) {
        return new GetRequest().process(requestBuilder);
    }

    public Response addBook(RequestBuilder requestBuilder) {
        return new PostRequest().process(requestBuilder);
    }
}
