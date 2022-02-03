package com.example.otomat_app.services;

import com.example.otomat_app.entities.Product;
import com.example.otomat_app.entities.Slot;
import com.example.otomat_app.repository.SlotRepository;
import com.example.otomat_app.requests.SlotCreateRequest;
import com.example.otomat_app.responses.SlotResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SlotService {

    SlotRepository slotRepository;
    private ProductService productService;

    public Slot getOneSlotById(Long productId) {
        return slotRepository.findById(productId).orElse(null);
    }

    public List<SlotResponse> getAllSlots(Optional<Long> productId) {
        List<Slot> list;

        if (productId.isPresent()) {
            list = slotRepository.findByProductId(productId.get());
        } else
            list = slotRepository.findAll();
        return list.stream().map(like -> new SlotResponse(like)).collect(Collectors.toList());

    }
    public Slot createOneSlot(SlotCreateRequest newSlotRequest) {
        Product product = productService.getOneProductById(newSlotRequest.getProductId());
        if(product == null)
            return null;
        Slot toSave = new Slot();
        toSave.setId(newSlotRequest.getId());
        toSave.setProduct(product);
        return slotRepository.save(toSave);
    }
}
