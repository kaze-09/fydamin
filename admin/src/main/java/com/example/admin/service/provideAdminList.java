package com.example.admin.service;

import com.example.admin.domain.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.admin.dao.loginMapper;

import java.util.List;
@Service
public class provideAdminList {
    @Autowired
    private loginMapper loginMapper;
    public boolean ifAdmin(String username,String password){
        List<admin> admins = loginMapper.match();
        for ( admin user: admins) {
            if(user.getUsername().equals(username)&&user.getPassword().equals(password))
                return true;
        }
        return false;
    }
}