package com.suixingpay.smTest.mapper;

import com.suixingpay.smTest.model.user;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    user selectById(int id);
    int addAge();

}
