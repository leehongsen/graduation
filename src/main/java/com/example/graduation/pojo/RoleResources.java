package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_role_resources")
public class RoleResources {
    @Id
    private Integer roleId;

    @Id
    private Integer resourcesId;

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
     * @return resourcesId
     */
    public Integer getResourcesId() {
        return resourcesId;
    }

    /**
     * @param resourcesId
     */
    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }
}