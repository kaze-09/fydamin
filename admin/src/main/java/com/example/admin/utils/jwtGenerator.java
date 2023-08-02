package com.example.admin.utils;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class jwtGenerator {
    public static String generateToken(String username){
        long time = 1000*60*60*24;
        String signature = "admin";
        JwtBuilder jwtBuilder = Jwts.builder();
        String token = jwtBuilder
                .setHeaderParam("typ","JWT")
                .setHeaderParam("alg","HS256")
                .claim("username",username)
                .setSubject("adminLogin")
                .setExpiration(new Date(System.currentTimeMillis()+time))
                .signWith(SignatureAlgorithm.HS256,signature)
                .compact();
        System.out.println(token);
        return token;
    }
}
