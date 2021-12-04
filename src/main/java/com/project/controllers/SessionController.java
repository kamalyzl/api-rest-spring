package com.project.controllers;


import com.project.entity.User;
import com.project.security.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/v1/session")
public class SessionController {

    @Autowired
    private UserSession userDetails;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    UserDetails getDetailUser(@RequestBody User us){
        return userDetails.loadUserByUsername(us.getUsername());
    }

}
