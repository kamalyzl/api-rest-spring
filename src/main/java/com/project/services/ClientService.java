package com.project.services;

import com.project.models.Client;
import com.project.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientDAO;

    public Client create(Client obj) {
        return clientDAO.save(obj);
    }

    public List<Client> getAll(){
        return clientDAO.findAll();
    }

    public Optional<Client> get(int id){
        return clientDAO.findById(id);
    }
}
