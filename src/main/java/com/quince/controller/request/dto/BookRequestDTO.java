package com.quince.controller.request.dto;

import com.quince.core.RequestBody;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class BookRequestDTO implements RequestBody {
    private String userId;
    private List<ISBNDTO> collectionOfIsbns;
}
