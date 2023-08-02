package com.example.admin.utils;

import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class postTokenClass {
    public static String postToken(String secret,String response){
        MultiValueMap<String,String> params =new LinkedMultiValueMap<>();
        String url = "https://hcaptcha.com/siteverify";
        params.add("secret",secret);
        params.add("response",response);
        System.out.println(params);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        ResponseEntity<String> FinalResponse = restTemplate.exchange(url,method,requestEntity, String.class);
        return FinalResponse.getBody();
    }
}