package com.project.repository;

import com.project.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
    public abstract List<Delivery> findBySessionId(String sessionId);
}
