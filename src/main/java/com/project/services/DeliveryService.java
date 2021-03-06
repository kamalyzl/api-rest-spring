package com.project.services;

import com.project.entity.Client;
import com.project.entity.Delivery;
import com.project.entity.Product;
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
        delivery.setStatus("created");

        // add client
       Optional<Client> clientOptional = clientDAO.findById(obj.getClient().getClientId());
       if(clientOptional.isPresent()) {
            delivery.setClient(clientOptional.get());
        }

        // add producto
        Optional<Product> productOptional = productDAO.findById(obj.getProduct().getProductId());
        if(clientOptional.isPresent()) {
            delivery.setProduct(productOptional.get());
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
