package com.zb.entity;

import io.swagger.annotations.ApiModelProperty;

public class User {
    @ApiModelProperty(value = "用户编号")
    private Integer id;
    @ApiModelProperty(value = "用户名称")
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
