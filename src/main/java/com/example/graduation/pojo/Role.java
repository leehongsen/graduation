package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_role")
public class Role {
    @Id
    private Integer roleId;

    private String roleDes;

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

    /**
     * @return roleDes
     */
    public String getRoleDes() {
        return roleDes;
    }

    /**
     * @param roleDes
     */
    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes == null ? null : roleDes.trim();
    }
}