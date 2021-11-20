package com.cibertec.project.services;

import com.cibertec.project.models.Delivery;
import com.cibertec.project.repository.DeliveryRepository;
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
