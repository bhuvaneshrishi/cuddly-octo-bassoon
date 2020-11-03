package com.cashapona.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cashapona.domain.Product;
import com.cashapona.services.ProductService;

import java.util.List;

@Controller
public class MyController {
    private ProductService productService;
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    public List<Product> getProducts(){
        return productService.listProducts();
    }
}
