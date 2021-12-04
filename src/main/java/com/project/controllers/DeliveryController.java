package com.project.controllers;

import com.project.entity.Delivery;
import com.project.entity.ResponseDelivery;
import com.project.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ResponseDelivery getAll(){
        ResponseDelivery res = new ResponseDelivery();
        res.setStatus("ok");
        res.setDelivery(deliveryService.getAll());
        return res;
    }

    @RequestMapping(value = "/filter", params = { "sessionId" }, method = RequestMethod.GET)
    ResponseDelivery filter(@RequestParam("sessionId") String sessionId){
        ResponseDelivery res = new ResponseDelivery();
        res.setStatus("ok");
        res.setDelivery(deliveryService.searchBySessionId(sessionId));
       return res;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Delivery> get(@PathVariable int id){
        return deliveryService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Delivery create(@RequestBody Delivery obj){
        return deliveryService.create(obj);
    }

   /* @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Delivery update(@RequestBody Delivery obj){
        return deliveryService.create(obj);
    }*/

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable int id) {
        deliveryService.remove(id);
    }

}
