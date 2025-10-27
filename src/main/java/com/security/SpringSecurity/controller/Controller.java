package com.security.SpringSecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Security Application";
    }
    @GetMapping("/account")
    public String account(){
        return "Account Section";
    }
    @GetMapping("/balance")
    public String balance(){
        return "Balance Section";
    }
    @GetMapping("/common")
    public String common(){
        return "Common Section";
    }
}
