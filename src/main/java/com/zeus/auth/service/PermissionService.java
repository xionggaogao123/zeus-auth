package com.zeus.auth.service;

import com.zeus.auth.dao.PermissionDao;
import com.zeus.auth.domain.Permission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-02-23 下午9:43
 * @Description
 */
@Service
public class PermissionService {

    @Resource
    private PermissionDao permissionDao;


    public Long createPermission(Permission permission) {
        return (long)permissionDao.insert(permission);
    }

}
