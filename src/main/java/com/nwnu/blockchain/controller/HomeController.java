package com.nwnu.blockchain.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {


    @GetMapping("/Login")
    public String login(){
        return "Login";
    }

    @GetMapping("/Regist")
    public String regist(){
        return "Regist";
    }

    @GetMapping("/Error")
    public String error(){
        return "error";
    }

    @GetMapping("/Welcome")
    public String welcome(){
        return "Welcome";
    }


}
