package com.zto.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户信息(UserInfo)实体类
 *
 * @author makejava
 * @since 2024-12-25 09:31:11
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 563753854471722361L;

    private Integer id;

    private String userName;

    private String userUrl;

    private String userPassword;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}

