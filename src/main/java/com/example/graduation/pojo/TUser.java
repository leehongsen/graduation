package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_user")
public class TUser implements Serializable {
    private static final long serialVersionUID = 5379585991742714551L;
    @Id
    @Column(name = "userId")
    private Integer userid;

    private String username;

    private String password;

    private String enable;

    /**
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }
}