package com.example.otomat_app.responses;

import com.example.otomat_app.entities.Product;
import lombok.Data;

@Data
public class ProductResponse {

    Long id;
    String productName;
    Integer stock;
    Boolean sugarChoice;
    Double price;
    String creationDate;
    String updateDate;

    public ProductResponse(Product entity) {
        this.id = entity.getId();
        this.productName = entity.getProductName();
        this.stock = entity.getStock();
        this.sugarChoice = entity.getSugarChoice();
        this.price = entity.getPrice();
        this.creationDate = entity.getCreationDate();
        this.updateDate = entity.getUpdateDate();
    }
}
