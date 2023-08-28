package com.quince.controller.response.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class BookDTO {
    private String isbn;
    private String title;
    private String subTitle;
    private String author;
    @JsonProperty("publish_date")
    private String publishDate;
    private String publisher;
    private String pages;
    private String number;
    private String description;
    private String website;
}
