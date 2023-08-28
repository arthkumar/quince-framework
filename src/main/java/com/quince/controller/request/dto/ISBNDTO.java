package com.quince.controller.request.dto;

import com.quince.core.RequestBody;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ISBNDTO implements RequestBody {
    private String isbn;
}
