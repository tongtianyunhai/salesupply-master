package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.domain.entity.User;
import com.javasm.salesupply.mapper.UserDao;
import com.javasm.salesupply.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/12-11:04
 * @Since:jdk1.8
 * @Description:TODO
 */

@RequestMapping("user")
@RestController
@Api(value = "adminController", description = "用户管理")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户", notes = "查询所有用户")
    @RequestMapping("login")
    public AxiosResult<User> login(@RequestBody User user) {
        User res = userService.findUser(user.getUserName());
        if (res.getPwd().equals(user.getPwd())) {
            return AxiosResult.success(user);
        }
        return AxiosResult.error();
    }
}