package com.example.otomat_app.controller;


import com.example.otomat_app.entities.Slot;

import com.example.otomat_app.repository.SlotRepository;
import com.example.otomat_app.requests.SlotCreateRequest;
import com.example.otomat_app.responses.SlotResponse;
import com.example.otomat_app.services.SlotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/slots")
public class SlotController {

    private SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }

    @GetMapping
    public List<SlotResponse> getAllSlots(@RequestParam Optional<Long> productId) {
        return slotService.getAllSlots(productId);
    }
        @PostMapping
        public Slot createOneSlot(@RequestBody SlotCreateRequest newSlotRequest) {
            return slotService.createOneSlot(newSlotRequest);

    }
}
