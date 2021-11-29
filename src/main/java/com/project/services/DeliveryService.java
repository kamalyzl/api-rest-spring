package com.project.services;

import com.project.models.Client;
import com.project.models.Delivery;
import com.project.models.Product;
import com.project.repository.ClientRepository;
import com.project.repository.DeliveryRepository;
import com.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryDAO;

    @Autowired
    private ClientRepository clientDAO;


    @Autowired
    private ProductRepository productDAO;

    public Delivery create(Delivery obj) {
        Delivery delivery = new Delivery();
        delivery.setCount(obj.getCount());
        delivery.setCreateDate(new Date());
        delivery.setSessionId(obj.getSessionId());
        delivery.setDeliveryAddress(obj.getDeliveryAddress());

        // add client
       Optional<Client> clientOptional = clientDAO.findById(obj.getMClient().getId());
       if(clientOptional.isPresent()) {
            delivery.setMClient(clientOptional.get());
        }

        // add producto
        Optional<Product> productOptional = productDAO.findById(obj.getMProduct().getId());
        if(clientOptional.isPresent()) {
            delivery.setMProduct(productOptional.get());
        }
        deliveryDAO.save(delivery);
        return delivery;
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

    public List<Delivery> searchBySessionId(String sessionID){
        return deliveryDAO.findBySessionId(sessionID);
    }
}
