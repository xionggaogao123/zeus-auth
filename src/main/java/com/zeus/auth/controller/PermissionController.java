package com.zeus.auth.controller;

import com.zeus.auth.domain.Permission;
import com.zeus.auth.service.PermissionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-02-23 下午10:13
 * @Description
 */
@RestController
public class PermissionController {

    @Resource
    private PermissionService permissionService;

    @PostMapping("api/permission/create")
    public Long createPermission(@RequestBody Permission permission) {
        return permissionService.createPermission(permission);
    }


}
