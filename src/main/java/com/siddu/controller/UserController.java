package com.siddu.controller;

import java.text.SimpleDateFormat;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddu.db2.domain.User;
import com.siddu.db2.repositories.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "save")
    public User saveuserDeatils() {
        User obj = new User();
        obj.setUserName("User" + new Random().nextInt());
        obj.setPwd("pwd" + new Random().nextInt());
        User user = userRepository.save(obj);
        return user;
    }
    

    @RequestMapping(value = "{userName}")
    public User saveuserDeatils(@PathVariable("userName") String userName) {
        User user = userRepository.findByUserName(userName);
        return user;
    }

}
