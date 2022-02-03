package com.example.otomat_app.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="orders")
@Data
public class Orders {

    @Id
    Long id;

    Long productId;

    Number number;
    Number sugarNumber;

    Double totalAmount;
    String paymentMethod;
    Double moneyReturnAmount;
    Date creationDate;
    Date updateDate;
}
