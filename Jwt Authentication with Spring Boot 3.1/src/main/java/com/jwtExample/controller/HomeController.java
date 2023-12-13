package com.jwtExample.controller;

import com.jwtExample.model.Users;
import com.jwtExample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    UserService userService;
    @RequestMapping("/users")
    public List<Users> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }

    @GetMapping("/current-user")
    public  String getLoggedInUser(Principal principal){
        return principal.getName();
    }

}
