package com.cibertec.project.controllers;

import com.cibertec.project.models.Client;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Client> getAll(){
        List<Client> list = new ArrayList<>();
        Client client = new Client();
        client.setName("Carlos");

        list.add(client);
        return list ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Client get(@PathVariable long id){
        Client client = new Client();
        client.setName("Juan");
        return client ;
    }

}
