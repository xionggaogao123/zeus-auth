package com.zeus.auth.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author keven
 * @date 2018-02-23 下午9:28
 * @Description 用户实体类
 */
public class User implements Serializable{

    private static final long serialVersionUID = 753606865562347664L;

    private Long id;

    private String name;

    private String password;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
