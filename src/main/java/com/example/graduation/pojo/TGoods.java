package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_goods")
public class TGoods implements Serializable {
    private static final long serialVersionUID = 5329309648197297431L;
    /**
     * 商品类型编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品类型名称
     */
    private String name;

    /**
     * 商家编号
     */
    @Column(name = "business_id")
    private Integer businessId;

    /**
     * 限购数量
     */
    @Column(name = "limit_num")
    private Integer limitNum;

    /**
     * 商品类型图标
     */
    @Column(name = "g_pic")
    private String gPic;

    /**
     * 获取商品类型编号
     *
     * @return id - 商品类型编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置商品类型编号
     *
     * @param id 商品类型编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品类型名称
     *
     * @return name - 商品类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品类型名称
     *
     * @param name 商品类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商家编号
     *
     * @return business_id - 商家编号
     */
    public Integer getBusinessId() {
        return businessId;
    }

    /**
     * 设置商家编号
     *
     * @param businessId 商家编号
     */
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    /**
     * 获取限购数量
     *
     * @return limit_num - 限购数量
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * 设置限购数量
     *
     * @param limitNum 限购数量
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * 获取商品类型图标
     *
     * @return g_pic - 商品类型图标
     */
    public String getgPic() {
        return gPic;
    }

    /**
     * 设置商品类型图标
     *
     * @param gPic 商品类型图标
     */
    public void setgPic(String gPic) {
        this.gPic = gPic;
    }
}