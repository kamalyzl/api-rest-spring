package com.project.repository;

import com.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUsername(String username);

    @Modifying
    @Query("update User u set u.status = ?1 where u.userId = ?2")
    int updateStatus(String status, int id);
}
