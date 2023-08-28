package com.quince.core.processor.internal;

import com.quince.core.builder.RequestBuilder;
import io.restassured.response.Response;

public interface RequestProcessor {
    Response process(RequestBuilder requestBuilder);
}
