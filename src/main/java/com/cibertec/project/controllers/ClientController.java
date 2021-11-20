package com.cibertec.project.controllers;

import com.cibertec.project.models.Client;
import com.cibertec.project.repository.ClientRepository;
import com.cibertec.project.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {


    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Client> getAll(){
        return clientService.getAll();
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
