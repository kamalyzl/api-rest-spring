package com.cibertec.project.controllers;

import com.cibertec.project.models.Delivery;
import com.cibertec.project.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Delivery> getAll(){
        return deliveryService.listAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Delivery get(@PathVariable long id){
        Delivery delivery = new Delivery();
        delivery.setCount(2);
        return delivery ;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Delivery create(@RequestBody Delivery delivery){
        return delivery ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Delivery update(@RequestBody Delivery delivery){
        return delivery ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        //roleService.delete(id);
    }

}
