package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_resources")
public class Resources {
    @Id
    private Integer resourcesId;

    private String name;

    private String resUrl;

    private Integer type;

    private Integer parentId;

    private Integer sort;

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
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return resUrl
     */
    public String getResUrl() {
        return resUrl;
    }

    /**
     * @param resUrl
     */
    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
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
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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