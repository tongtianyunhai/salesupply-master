package com.javasm.salesupply.service;

import com.javasm.salesupply.domain.entity.User;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/12-11:08
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface UserService {
    User findUser(String userName);
}