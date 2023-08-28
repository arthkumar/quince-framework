package com.quince.controller.request.builder;

import com.quince.controller.request.header.Header;
import com.quince.controller.request.route.BookControllerEndpoints;
import com.quince.core.RequestBody;
import com.quince.core.builder.RequestBuilder;
import io.restassured.http.ContentType;
import lombok.Getter;

@Getter
public class AddBookRequestBuilder {
    private RequestBuilder requestBuilder;
    public AddBookRequestBuilder(String tokenID, RequestBody requestBody) {
        this.requestBuilder = RequestBuilder.builder()
                .requestBody(requestBody)
                .endpoint(BookControllerEndpoints.BOOK)
                .contentType(ContentType.JSON)
                .header(Header.getBookHeader(tokenID))
                .contentType(ContentType.JSON)
                .build();
    }
}
