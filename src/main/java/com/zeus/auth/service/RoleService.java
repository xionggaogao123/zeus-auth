package com.zeus.auth.service;

import com.zeus.auth.dao.RoleDao;
import com.zeus.auth.domain.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-02-23 下午9:43
 * @Description
 */
@Service
public class RoleService {

    @Resource
    private RoleDao roleDao;


    public Long createRole(Role role) {
        return (long)roleDao.insert(role);
    }

}
