package com.zeus.auth.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author keven
 * @date 2018-02-23 下午9:32
 * @Description 权限点
 */
public class Permission implements Serializable{

    private static final long serialVersionUID = -5982665319395608160L;

    private Long id;

    /**
     * 权限点名称
     */
    private String name;

    /**
     * 权限点描述
     */
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
