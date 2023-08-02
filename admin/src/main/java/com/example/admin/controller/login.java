package com.example.admin.controller;

import com.example.admin.dao.loginMapper;
import com.example.admin.domain.LoginUser;
import com.example.admin.domain.admin;
import com.example.admin.service.provideAdminList;
import com.example.admin.utils.jwtGenerator;
import com.example.admin.utils.postTokenClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class login {
    @Autowired
    private provideAdminList provideAdminList;
    @RequestMapping(value = "/login")
    public@ResponseBody String login(@RequestBody LoginUser loginForm){
        String usrname = loginForm.getUsername();
        String password = loginForm.getPassword();
        String secret = "0x0000000000000000000000000000000000000000";
        String json = postTokenClass.postToken(secret,loginForm.getToken());
        System.out.println(json);
        boolean flag = provideAdminList.ifAdmin(usrname,password);
        System.out.println(flag);

        if(json.contains("true")&&flag==true){
            String token = jwtGenerator.generateToken(usrname);
            return  "{\"captchaValid\":\"true\",\"accountValid\":\"true\",\"token\":\""+token+"\"}";
        }
        else return "{\"captchaValid\":\"false\",\"accountValid\":\"false\",\"token\":\" \"}";
    }
}
