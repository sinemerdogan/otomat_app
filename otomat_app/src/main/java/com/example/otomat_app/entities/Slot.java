package com.example.otomat_app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="slots")
@Data
public class Slot {
    @Id
    Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productId", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    Product product;
}
