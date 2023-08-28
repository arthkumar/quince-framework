package com.quince.controller.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.util.List;

@Getter
public class UserResponseDTO {
    private String userID;
    private String username;
    @JsonIgnore
    private List<BookDTO> books;
}
