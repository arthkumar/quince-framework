package com.quince.controller.request.body;

import com.quince.controller.appdata.Users;
import com.quince.controller.request.dto.LoginViewDto;

public class UserBodyBuilder {
    private UserBodyBuilder() {}

    public static LoginViewDto getUser(String id) {
        return LoginViewDto.builder()
                .userName(Users.ARTH.getUsername().concat(id))
                .password(Users.ARTH.getPassword())
                .build();
    }
}