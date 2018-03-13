package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_role")
public class TRole implements Serializable {
    private static final long serialVersionUID = -1364394313239163734L;
    @Id
    @Column(name = "roleId")
    private Integer roleid;

    @Column(name = "roleDes")
    private String roledes;

    @Transient
    private Integer selected;

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

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