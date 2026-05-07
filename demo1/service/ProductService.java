package com.web.demo1.service;

import com.web.demo1.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products= Arrays.asList(
            new Product(1,"laptop",40000),
            new Product(2,"desktop",10000));
    public List<Product> getProducts(){
        return products;
    }
}
