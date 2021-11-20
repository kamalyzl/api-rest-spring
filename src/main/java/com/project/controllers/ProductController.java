package com.project.controllers;

import com.project.models.Product;
import com.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Product> getAll(){
        return productService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Product create(@RequestBody Product obj){
        return productService.create(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> get(@PathVariable int id){
        return productService.get(id);
    }
}
