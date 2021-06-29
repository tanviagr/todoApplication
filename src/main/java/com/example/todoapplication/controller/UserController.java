package com.example.todoapplication.controller;

import com.example.todoapplication.entity.User;
import com.example.todoapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService service;

    @GetMapping("/hello-world")
    public String getHelloWorld()
    {
        return "Hello World!";
    }

    @GetMapping("/get-all-users")
    public List<User> getAllUsers()
    {
        return service.getAllUsers();
    }
}
