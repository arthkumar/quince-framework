package com.quince.controller.request.body;

import com.quince.controller.request.dto.BookRequestDTO;
import com.quince.controller.request.dto.ISBNDTO;
import com.quince.core.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class BookBodyBuilder {
    public RequestBody addBook(String isbn, String userID) {
        ISBNDTO isbndto = ISBNDTO.builder().isbn(isbn).build();
        List<ISBNDTO> isbndtos = new ArrayList<>();
        isbndtos.add(isbndto);
        return BookRequestDTO.builder().userId(userID).collectionOfIsbns(isbndtos).build();
    }
}
