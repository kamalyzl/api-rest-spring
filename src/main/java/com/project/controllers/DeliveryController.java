package com.project.controllers;

import com.project.models.Delivery;
import com.project.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
