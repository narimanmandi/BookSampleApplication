package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.repository.GenericRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends GenericServiceImpl<User, String> implements UserService {


    public UserServiceImpl(GenericRepository<User, String> repository) {
        super(repository);
    }
}
