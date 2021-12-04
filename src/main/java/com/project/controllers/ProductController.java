package com.project.controllers;

import com.project.entity.Product;
import com.project.entity.ResponseProduct;
import com.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ResponseProduct getAll(){
        ResponseProduct res = new ResponseProduct();
        res.setStatus("ok");
        res.setProduct(productService.getAll());
        return res;
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
