package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_role")
public class TRole {
    @Id
    @Column(name = "roleId")
    private Integer roleid;

    @Column(name = "roleDes")
    private String roledes;

    /**
     * @return roleId
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * @return roleDes
     */
    public String getRoledes() {
        return roledes;
    }

    /**
     * @param roledes
     */
    public void setRoledes(String roledes) {
        this.roledes = roledes;
    }
}