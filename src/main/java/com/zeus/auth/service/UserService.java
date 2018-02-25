package com.zeus.auth.service;

import com.zeus.auth.dao.UserDao;
import com.zeus.auth.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-02-23 下午9:42
 * @Description
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public Long createUser(User user) {
        return (long)userDao.insert(user);
    }




}
