package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_user_role")
public class UserRole {
    @Id
    private Integer userId;

    @Id
    private Integer roleId;

    /**
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return roleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}