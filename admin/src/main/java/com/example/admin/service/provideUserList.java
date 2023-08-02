package com.example.admin.service;

import com.example.admin.dao.userMapper;
import com.example.admin.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class provideUserList {
    @Autowired
    private userMapper userMapper;

    public List<User> getAllusers(){
        System.out.println(userMapper.getAllUsers());
        return userMapper.getAllUsers();
    }
}
