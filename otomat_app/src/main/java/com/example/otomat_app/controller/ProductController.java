package com.example.otomat_app.controller;

import com.example.otomat_app.entities.Product;
import com.example.otomat_app.responses.ProductResponse;
import com.example.otomat_app.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createUser(@RequestBody Product newProduct) {
        return productService.saveOneProduct(newProduct);
    }

    @GetMapping("/{productId}")
    public ProductResponse getOneProduct(@PathVariable Long productId) {
        return new ProductResponse(productService.getOneProductById(productId));
    }

    @PutMapping("/{productId}")
    public Product updateOneProduct(@PathVariable Long productId, @RequestBody Product newProduct) {
        return productService.updateOneProduct(productId, newProduct);
    }

    @DeleteMapping("/{productId}")
    public void deleteOneProduct(@PathVariable Long productId) {
        productService.deleteById(productId);
    }


}
