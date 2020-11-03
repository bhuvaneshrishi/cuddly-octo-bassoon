package com.cashapona.services;

import com.cashapona.domain.Product;
import com.cashapona.services.ProductService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unused")
@Service
public class ProductServiceImpl implements ProductService {
	
	@Override
    public List<Product> listProducts() {
        ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product(" Product 1 description"));
        products.add(new Product("Product 2 description"));
        return products;
    }


}
