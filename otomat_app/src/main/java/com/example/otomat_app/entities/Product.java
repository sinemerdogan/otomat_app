package com.example.otomat_app.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
@Data
public class Product {

    @Id
    Long id;

    String productName;
    Integer stock;
    Boolean sugarChoice;
    Double price;
    String creationDate;
    String updateDate;
}
