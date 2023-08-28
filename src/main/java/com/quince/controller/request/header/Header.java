package com.quince.controller.request.header;

import java.util.HashMap;
import java.util.Map;

public class Header {
    private Header() {}

    public static Map<String, Object> getBookHeader(String tokenID) {
        Map<String, Object> header = new HashMap<>();
        header.put("Authorization", "Bearer ".concat(tokenID));
        return header;
    }

    public static Map<String, Object> getUserHeader() {
        Map<String, Object> header = new HashMap<>();
        header.put("Content-Type", "application/json");
        header.put("accept", "application/json");
        return header;
    }
}
