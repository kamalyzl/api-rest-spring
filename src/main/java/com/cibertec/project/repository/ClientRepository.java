package com.cibertec.project.repository;

import com.cibertec.project.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {


}
