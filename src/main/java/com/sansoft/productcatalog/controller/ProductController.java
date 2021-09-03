package com.sansoft.productcatalog.controller;

import com.sansoft.productcatalog.model.Product;
import com.sansoft.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping (value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }
}
