package com.example.otomat_app.responses;

import com.example.otomat_app.entities.Slot;

public class SlotResponse {


    Long id;
    Long productId;


    public SlotResponse(Slot entity) {
        this.id = entity.getId();
        this.productId = entity.getProduct().getId();
    }
}
