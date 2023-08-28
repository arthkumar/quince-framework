package com.quince.controller.response.dto;


import lombok.Getter;

@Getter
public class TokenDTO {
    private String token;
    private String expires;
    private String status;
    private String result;
}
