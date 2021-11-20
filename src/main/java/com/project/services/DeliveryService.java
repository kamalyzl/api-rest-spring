package com.project.services;

import com.project.models.Delivery;
import com.project.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryDAO;

    public List<Delivery> listAll() {
        return deliveryDAO.findAll();
    }
}
