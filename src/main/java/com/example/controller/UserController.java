package com.example.controller;

import com.example.model.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("selectUserList")
    public List<User> selectUserList() {
        return userService.selectUserList();
    }

    @RequestMapping("selectUserById")
    public User selectUserById(Integer id) {
        return userService.selectUserById(id);
    }

}
