package com.project.controllers;



import com.project.entity.User;
import com.project.security.UserSession;
import com.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

   /* @Autowired
    private UserSession userDetails;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    UserDetails getDetailUser(@RequestBody User us){
        return userDetails.loadUserByUsername(us.getUsername());
    }*/


    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> list() {
        return userService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<User> get(@PathVariable int id){
        return userService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    User create(@RequestBody User obj){
        return userService.create(obj);
    }

    /*@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User us){
        return userService.create(us);
    } */

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable int id) {
        userService.remove(id);
    }

}
