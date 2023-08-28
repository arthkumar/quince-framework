package com.quince.controller.request.builder;

import com.quince.controller.request.header.Header;
import com.quince.controller.request.route.AccountControllerEndpoints;
import com.quince.core.RequestBody;
import com.quince.core.builder.RequestBuilder;
import io.restassured.http.ContentType;
import lombok.Getter;

@Getter
public class GenerateTokenRequestBuilder {
    private RequestBuilder requestBuilder;
    public GenerateTokenRequestBuilder(RequestBody requestBody) {
        this.requestBuilder = RequestBuilder.builder()
                .requestBody(requestBody)
                .endpoint(AccountControllerEndpoints.GENERATE_TOKEN)
                .contentType(ContentType.JSON)
                .header(Header.getUserHeader())
                .build();
    }
}
