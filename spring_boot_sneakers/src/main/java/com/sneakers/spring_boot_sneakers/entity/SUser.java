package com.sneakers.spring_boot_sneakers.entity;

import java.io.Serializable;

/**
 * 用户表，用于记录用户信息（微信用户）(SUser)实体类
 *
 * @author makejava
 * @since 2022-10-24 11:31:49
 */
public class SUser implements Serializable {
    private static final long serialVersionUID = 694285638570765230L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 微信小程序openid
     */
    private Integer openid;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String avatarUrl;
    /**
     * 性别（0是男1是女）
     */
    private Integer gender;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpenid() {
        return openid;
    }

    public void setOpenid(Integer openid) {
        this.openid = openid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

}

