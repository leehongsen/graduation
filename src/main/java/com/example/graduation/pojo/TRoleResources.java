package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_role_resources")
public class TRoleResources implements Serializable {
    private static final long serialVersionUID = -154121580350142993L;
    @Id
    @Column(name = "roleId")
    private Integer roleid;

    @Id
    @Column(name = "resourcesId")
    private Integer resourcesid;

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
     * @return resourcesId
     */
    public Integer getResourcesid() {
        return resourcesid;
    }

    /**
     * @param resourcesid
     */
    public void setResourcesid(Integer resourcesid) {
        this.resourcesid = resourcesid;
    }
}