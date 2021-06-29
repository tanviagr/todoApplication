package com.example.todoapplication.service;

import com.example.todoapplication.entity.User;
import com.example.todoapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers()
    {
        return repository.findAll();
    }
}
