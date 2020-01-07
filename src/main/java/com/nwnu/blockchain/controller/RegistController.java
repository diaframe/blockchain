package com.nwnu.blockchain.controller;
import com.nwnu.blockchain.domain.User;
import com.nwnu.blockchain.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class RegistController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/Regist")
    public String Regist(@RequestParam(value = "username") String username, @RequestParam("email") String email, @RequestParam("password") String password, HttpServletRequest request, HttpSession session){
        User user=new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        int count=userService.addUser(user);
        if(count==1){
            log.info("注册成功");
            return "Login.html";
        }else{
            log.info("注册失败");
            return "error.html";
    }
    }
}
