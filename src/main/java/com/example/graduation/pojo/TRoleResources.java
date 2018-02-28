package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_role_resources")
public class TRoleResources {
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