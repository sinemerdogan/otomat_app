package com.example.otomat_app.services;

import com.example.otomat_app.entities.Product;
import com.example.otomat_app.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveOneProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    public Product getOneProductById(Long Id) {
        return productRepository.findById(Id).orElse(null);
    }

    public Product updateOneProduct(@PathVariable Long Id, @RequestBody Product newProduct){
        Optional<Product> product = productRepository.findById(Id);
        if(product.isPresent()){
            Product foundProduct = product.get();
            foundProduct.setProductName(newProduct.getProductName());
            foundProduct.setPrice(newProduct.getPrice());
            foundProduct.setStock(newProduct.getStock());
            foundProduct.setUpdateDate(newProduct.getUpdateDate());
            productRepository.save(foundProduct);
            return foundProduct;
        }
        else
            return null;
    }

    public void deleteById(Long Id) {
        productRepository.deleteById(Id);
    }





}
