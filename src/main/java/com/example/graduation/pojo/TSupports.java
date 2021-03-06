package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_supports")
public class TSupports implements Serializable {
    private static final long serialVersionUID = 2009088789849770505L;
    /**
     * 类型
     */
    @Id
    private Integer type;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片
     */
    private String pic;

    @Transient
    private Integer selected;

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取图片
     *
     * @return pic - 图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置图片
     *
     * @param pic 图片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }
}