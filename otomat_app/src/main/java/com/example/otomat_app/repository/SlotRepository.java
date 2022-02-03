package com.example.otomat_app.repository;


import com.example.otomat_app.entities.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SlotRepository extends JpaRepository<Slot, Long> {
    List<Slot> findByProductId(Long productId);


}
