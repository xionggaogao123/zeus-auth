package com.zeus.auth.controller;

import com.zeus.auth.domain.User;
import com.zeus.auth.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-02-23 下午9:49
 * @Description
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;


    @ApiOperation("创建用户")
    @PostMapping("api/user/create")
    public Long createUser(@RequestBody User user) {
        return userService.createUser(user);
    }






}
