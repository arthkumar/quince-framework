package com.quince.controller.request.builder;

import com.quince.controller.request.header.Header;
import com.quince.controller.request.route.BookControllerEndpoints;
import com.quince.core.builder.RequestBuilder;
import io.restassured.http.ContentType;
import lombok.Getter;

@Getter
public class GetBookRequestBuilder {
    private RequestBuilder requestBuilder;
    public GetBookRequestBuilder(String tokenID) {
        this.requestBuilder = RequestBuilder.builder()
                .endpoint(BookControllerEndpoints.BOOK)
                .contentType(ContentType.JSON)
                .header(Header.getBookHeader(tokenID))
                .build();
    }
}
