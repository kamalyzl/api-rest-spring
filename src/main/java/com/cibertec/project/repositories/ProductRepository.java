package com.cibertec.project.repositories;

import com.cibertec.project.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> getAll();

    Product get(long id);

    Product create(Product produc);

    Product update(Product produc);

    void delete(long id);
}
