package com.cibertec.project.controllers;

import com.cibertec.project.models.Delivery;
import com.cibertec.project.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("delivery")
public class DeliveryController {

    @Resource
    private DeliveryService deliveryService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Delivery> getAll(){
        List<Delivery> list = new ArrayList<>();
        Delivery delivery = new Delivery();
        delivery.setAccount(2);

        list.add(delivery);

        //return deliveryService.getAll();

        return list ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Delivery get(@PathVariable long id){
        Delivery delivery = new Delivery();
        delivery.setAccount(2);
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
