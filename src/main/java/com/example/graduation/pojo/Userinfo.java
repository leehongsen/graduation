package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

public class Userinfo implements Serializable {
    private static final long serialVersionUID = -55876255663489642L;

    @Column(name = "userId")
    private Integer userid;

    private String username;

    private String password;

    private String enable;

    @Column(name = "roleId")
    private Integer roleid;

    @Column(name = "roleDes")
    private String roledes;

    @Column(name = "resourcesId")
    private Integer resourcesid;

    private String name;

    @Column(name = "resUrl")
    private String resurl;

    private Integer type;

    @Column(name = "parentId")
    private Integer parentid;

    private Integer sort;

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

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return resUrl
     */
    public String getResurl() {
        return resurl;
    }

    /**
     * @param resurl
     */
    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return parentId
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}