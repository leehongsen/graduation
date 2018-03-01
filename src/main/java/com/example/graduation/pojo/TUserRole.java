package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_user_role")
public class TUserRole implements Serializable {
    private static final long serialVersionUID = -8503969225290617718L;
    @Id
    @Column(name = "userId")
    private Integer userid;

    @Id
    @Column(name = "roleId")
    private String roleid;

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
     * @return roleId
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}