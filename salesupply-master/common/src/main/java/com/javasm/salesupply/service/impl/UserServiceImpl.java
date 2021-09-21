package com.javasm.salesupply.service.impl;

import com.javasm.salesupply.domain.entity.User;
import com.javasm.salesupply.mapper.UserDao;
import com.javasm.salesupply.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/12-19:38
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findUser(String userName) {
        return userDao.selectUserById(userName);
    }
}