package com.cashbook.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;

    private String name;

    private String nickName;

    private Byte gender;

    private Byte age;

    private Date birthday;

    private Byte cardType;

    private String cardNo;

    private String mobile;

    private String password;

    private String salt;

    private String email;

    private String imgUrl;

    private String personDesc;

    private String memo;

    private String clientId;

    private Byte status;

    private String openId;

    private String unionId;

    private String mpOpenId;

    private Byte platformType;

    private String mpVersion;

    private Date lastLoginTime;

    private Date createTime;

    private Long createUserId;

    private Date lastModifyTime;

    private Long lastModifyUserId;
}