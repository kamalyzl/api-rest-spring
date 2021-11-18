package com.cibertec.project.repositories;

import com.cibertec.project.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> getAll();

    Client get(long id);

    Client create(Client client);

    Client update(Client client);

    void delete(long id);

}
