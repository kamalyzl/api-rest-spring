package com.cibertec.project.services;

import com.cibertec.project.models.Delivery;
import com.cibertec.project.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Resource
    private DeliveryRepository repositorio;

   @Override
    public List<Delivery> getAll() {
        return repositorio.findAll();
    }
}
