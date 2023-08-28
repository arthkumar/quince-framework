package com.quince.controller.request.dto;

import com.quince.core.RequestBody;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginViewDto implements RequestBody {
    private String userName;
    private String password;
}
