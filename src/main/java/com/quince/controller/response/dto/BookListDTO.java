package com.quince.controller.response.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class BookListDTO {
    @JsonProperty("books")
    List<BookDTO> bookDTOList;
}
