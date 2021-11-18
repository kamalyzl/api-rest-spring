package com.cibertec.project.repositories;

import com.cibertec.project.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, String> {

    List<Delivery> findAll();

    // Delivery get(long id);

    //Delivery create(Delivery delivery);

    //Delivery update(Delivery delivery);

    // void delete(long id);

}
