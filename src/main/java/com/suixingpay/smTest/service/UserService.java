package com.suixingpay.smTest.service;

import com.suixingpay.smTest.mapper.UserMapper;
import com.suixingpay.smTest.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public user selectById(int id){
        return userMapper.selectById(id);
    }
    public void addAge(){
        userMapper.addAge();
    }
}
