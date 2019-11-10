package com.suixingpay.smTest.controller;

import com.suixingpay.smTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("smTest")
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return  userService.selectById(id).toString();
    }
    @RequestMapping("addAge")
    public void AddAge(){
        userService.addAge();
        //gittest
    }

}
