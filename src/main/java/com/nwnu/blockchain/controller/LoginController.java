package com.nwnu.blockchain.controller;

import com.nwnu.blockchain.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@Slf4j
public class LoginController {
    @Autowired
    private IUserService userService;


   @RequestMapping("/Login")
    public String Login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request, HttpSession session){
        boolean flag=userService.YZLogin(username,password);
        if(flag==true){
            log.info("successful");
           return "Welcome.html";
        }else{
            log.info("error");
          return "user_error.html";
        }
    }
}
