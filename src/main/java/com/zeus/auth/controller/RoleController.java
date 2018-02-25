package com.zeus.auth.controller;

import com.zeus.auth.domain.Role;
import com.zeus.auth.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-02-23 下午10:11
 * @Description
 */
@RestController
public class RoleController {

    @Resource
    private RoleService roleService;


    @ApiOperation("创建角色")
    @PostMapping("api/role/create")
    public Long createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }


}
