package com.cibertec.project.controllers;

import com.cibertec.project.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Product> getAll(){
        List<Product> list = new ArrayList<>();
        Product product = new Product();
        product.setName("Huevos dorados");

        list.add(product);
        return list ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Product get(@PathVariable long id){
        Product product = new Product();
        product.setName("Huevos blancos ");
        return product ;
    }
}
