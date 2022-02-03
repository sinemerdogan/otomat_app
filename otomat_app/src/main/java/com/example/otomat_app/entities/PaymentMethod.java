package com.example.otomat_app.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_methods")
@Data
public class PaymentMethod {
    @Id
    Long id;

    String paymentMethodName;
    String paymentMethodType;
}
