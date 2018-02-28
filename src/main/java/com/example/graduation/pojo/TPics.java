package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_pics")
public class TPics {
    /**
     * 图片id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商家id
     */
    @Column(name = "businesses_id")
    private Integer businessesId;

    /**
     * 图片地址
     */
    private String pic;

    /**
     * 获取图片id
     *
     * @return id - 图片id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置图片id
     *
     * @param id 图片id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商家id
     *
     * @return businesses_id - 商家id
     */
    public Integer getBusinessesId() {
        return businessesId;
    }

    /**
     * 设置商家id
     *
     * @param businessesId 商家id
     */
    public void setBusinessesId(Integer businessesId) {
        this.businessesId = businessesId;
    }

    /**
     * 获取图片地址
     *
     * @return pic - 图片地址
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置图片地址
     *
     * @param pic 图片地址
     */
    public void setPic(String pic) {
        this.pic = pic;
    }
}