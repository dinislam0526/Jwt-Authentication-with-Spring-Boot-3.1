package com.jwtExample.services;

import com.jwtExample.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<Users> store = new ArrayList<Users>();

    public UserService() {
        store.add(new Users(UUID.randomUUID().toString(),"Din Islam","din@gmail.com"));
        store.add(new Users(UUID.randomUUID().toString(),"Mominul","momin@gmail.com"));
        store.add(new Users(UUID.randomUUID().toString(),"Rajib","ragib@gmail.com"));
    }

    public List<Users> getUsers(){
        return store;
    };


}

