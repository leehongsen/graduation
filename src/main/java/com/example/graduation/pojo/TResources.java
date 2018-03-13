package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_resources")
public class TResources implements Serializable {
    private static final long serialVersionUID = -9117051685776067818L;
    @Id
    @Column(name = "resourcesId")
    private Integer resourcesid;

    private String name;

    @Column(name = "resUrl")
    private String resurl;

    private Integer type;

    @Column(name = "parentId")
    private Integer parentid;

    private Integer sort;

    @Transient
    private String checked;//是否选中

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
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