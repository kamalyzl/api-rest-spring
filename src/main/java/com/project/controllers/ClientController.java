package com.project.controllers;

import com.project.entity.Client;
import com.project.entity.ResponseClient;
import com.project.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ResponseClient getAll(){
        ResponseClient res = new ResponseClient();
        res.setStatus("ok");
        res.setClient(clientService.getAll());
        return res;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Client create(@RequestBody Client obj){
        return clientService.create(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Client> get(@PathVariable int id){
        return clientService.get(id);
    }

}
