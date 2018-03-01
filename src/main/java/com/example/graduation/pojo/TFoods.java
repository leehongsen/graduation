package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_foods")
public class TFoods implements Serializable {
    private static final long serialVersionUID = 1309686947648880976L;
    /**
     * 食物编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商家编号
     */
    @Column(name = "businesses_id")
    private Integer businessesId;

    /**
     * 商品类型编号
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 原价
     */
    @Column(name = "oldPrice")
    private Double oldprice;

    /**
     * 描述
     */
    private String description;

    /**
     * 售卖总数
     */
    @Column(name = "sellCount")
    private Integer sellcount;

    /**
     * 好评率
     */
    private Double rating;

    /**
     * 信息
     */
    private String info;

    /**
     * 图标
     */
    private String icon;

    /**
     * 图片
     */
    private String image;

    /**
     * 获取食物编号
     *
     * @return id - 食物编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置食物编号
     *
     * @param id 食物编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商家编号
     *
     * @return businesses_id - 商家编号
     */
    public Integer getBusinessesId() {
        return businessesId;
    }

    /**
     * 设置商家编号
     *
     * @param businessesId 商家编号
     */
    public void setBusinessesId(Integer businessesId) {
        this.businessesId = businessesId;
    }

    /**
     * 获取商品类型编号
     *
     * @return goods_id - 商品类型编号
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品类型编号
     *
     * @param goodsId 商品类型编号
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取原价
     *
     * @return oldPrice - 原价
     */
    public Double getOldprice() {
        return oldprice;
    }

    /**
     * 设置原价
     *
     * @param oldprice 原价
     */
    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
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
     * 获取售卖总数
     *
     * @return sellCount - 售卖总数
     */
    public Integer getSellcount() {
        return sellcount;
    }

    /**
     * 设置售卖总数
     *
     * @param sellcount 售卖总数
     */
    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
    }

    /**
     * 获取好评率
     *
     * @return rating - 好评率
     */
    public Double getRating() {
        return rating;
    }

    /**
     * 设置好评率
     *
     * @param rating 好评率
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /**
     * 获取信息
     *
     * @return info - 信息
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置信息
     *
     * @param info 信息
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取图片
     *
     * @return image - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image;
    }
}