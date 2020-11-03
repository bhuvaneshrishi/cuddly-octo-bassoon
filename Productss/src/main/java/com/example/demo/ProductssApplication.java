package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cashapona.controllers.MyController;
import com.cashapona.domain.Product;

import java.util.List;

@SpringBootApplication
@ComponentScan("com.cashapona")
public class ProductssApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProductssApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        List<Product> products = controller.getProducts();
        for(Product product : products){
            System.out.println(product.getDescription());
        }
    }
}
