package com.project.services;

import com.project.models.Delivery;
import com.project.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryDAO;

    public Delivery create(Delivery obj) {
        return deliveryDAO.save(obj);
    }

    public List<Delivery> getAll(){
        return deliveryDAO.findAll();
    }

    public Optional<Delivery> get(int id){
        return deliveryDAO.findById(id);
    }

    public void remove (int id) {
        deliveryDAO.deleteById(id);
    }
}
