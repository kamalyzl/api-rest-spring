package com.project.controllers;

import com.project.models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("welcome")
public class InitController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    Product get(){
        Product obj = new Product();
        obj.setName("nombre de ejemplo");
        obj.setDescription("Descripcion de ejemplo");
        return obj;
    }
}
