package com.quince.controller.appdata;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Users {
    ARTH("arthKI", "Kumar@24");
    private String username;
    private String password;
}
