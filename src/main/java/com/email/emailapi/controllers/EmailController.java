package com.email.emailapi.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "WELCOME TO EMAIL API";

    }
}
