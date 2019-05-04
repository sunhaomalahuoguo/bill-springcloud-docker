package com.mengxuegu.bill.controller;

import com.mengxuegu.bill.entities.User;
import com.mengxuegu.bill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/2
 * @since 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/user/getbyusername")
    public User getUserByUsername(@RequestParam("username") String username){
        return userService.getUserByUsername(username);
    }

    @PostMapping("/user/list")
    public List<User> getUsers(@RequestBody User user){
        return userService.getUsers(user);
    }

    @GetMapping("/user/getbyid")
    public User getUserById(@RequestParam("id") Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/user/add")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/user/delete")
    public int deleteUserById(@RequestParam("id") Integer id){
        return userService.deleteUserById(id);
    }

    @PostMapping("/user/update")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}