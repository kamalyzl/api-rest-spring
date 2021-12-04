package com.project.services;


import com.project.entity.User;
import com.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userDAO;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public User create(User obj) {
        User us = new User();

        us.setUsername(obj.getUsername());
        us.setPassword(encoder.encode(obj.getUsername()));

        userDAO.save(us);
        return us;
    }

    public int updateStatus(String status, int id){
        return userDAO.updateStatus(status, id);
    }

    public void remove (int id) {
        userDAO.deleteById(id);
    }

    public List<User> getAll(){
        return userDAO.findAll();
    }

    public Optional<User> get(int id){
        return userDAO.findById(id);
    }

}
