package com.mengxuegu.bill.service;

import com.mengxuegu.bill.entities.User;

import java.util.List;

public interface UserService {
    User getUserByUsername(String username);

    List<User> getUsers(User user);

    User getUserById(Integer id);

    int addUser(User user);

    int deleteUserById(Integer id);

    int updateUser(User user);
}
