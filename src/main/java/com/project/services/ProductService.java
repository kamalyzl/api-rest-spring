package com.project.services;


import com.project.entity.Product;
import com.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productDAO;

    public Product create(Product obj) {
        return productDAO.save(obj);
    }

    public List<Product> getAll(){
        return productDAO.findAll();
    }

    public Optional<Product> get(int id){
        return productDAO.findById(id);
    }

}
