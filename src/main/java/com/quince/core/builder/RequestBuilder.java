package com.quince.core.builder;

import com.quince.core.RequestBody;
import io.restassured.http.ContentType;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter
public class RequestBuilder {
    private String endpoint;
    private Map<String, Object> header;
    private ContentType contentType;
    private RequestBody requestBody;
}
