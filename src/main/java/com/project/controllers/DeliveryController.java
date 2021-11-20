package com.project.controllers;

import com.project.models.Delivery;
import com.project.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Delivery> getAll(){
        return deliveryService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Delivery> get(@PathVariable int id){
        return deliveryService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Delivery create(@RequestBody Delivery obj){
        return deliveryService.create(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Delivery update(@RequestBody Delivery obj){
        return deliveryService.create(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable int id) {
        deliveryService.remove(id);
    }

}
