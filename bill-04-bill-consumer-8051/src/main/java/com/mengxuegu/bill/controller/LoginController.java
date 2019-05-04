package com.mengxuegu.bill.controller;

import com.mengxuegu.bill.entities.User;
import com.mengxuegu.bill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/2
 * @since 1.0.0
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String init(){
        return "main/login";
    }

    @PostMapping("/login")
    public String login(String username,
                        String password,
                        HttpSession session){

        User user = userService.getUserByUsername(username.trim());
        if (user == null){
            return "main/login";
        }else {
            if (user.getPassword().equals(password.trim())){
                session.setAttribute("loginUser",user);
                return "main/index";
            }else {
                return "main/login";
            }
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginUser");
        session.invalidate();
        return "main/login";
    }

}