package com.mengxuegu.bill.service;

import com.mengxuegu.bill.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient("user-provider")
public interface UserService {
    @GetMapping("/user/getbyusername")
    public User getUserByUsername(@RequestParam("username") String username);

    @PostMapping("/user/list")
    public List<User> getUsers(@RequestBody User user);

    @GetMapping("/user/getbyid")
    public User getUserById(@RequestParam("id") Integer id);

    @PostMapping("/user/add")
    public int addUser(@RequestBody User user);

    @GetMapping("/user/delete")
    public int deleteUserById(@RequestParam("id") Integer id);

    @PostMapping("/user/update")
    public int updateUser(@RequestBody User user);
}
