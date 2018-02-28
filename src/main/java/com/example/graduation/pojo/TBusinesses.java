package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_businesses")
public class TBusinesses {
    /**
     * 商家编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商家名称
     */
    private String name;

    /**
     * 营业额
     */
    private Double turnover;

    /**
     * 商家电话
     */
    private String phone;

    /**
     * 商家地址
     */
    private String address;

    /**
     * 营业时间
     */
    private String time;

    /**
     * 商家菜品品类
     */
    private String sort;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 描述
     */
    private String description;

    /**
     * 到达时间
     */
    @Column(name = "deliveryTime")
    private String deliverytime;

    /**
     * 综合分数
     */
    private Double score;

    /**
     * 服务态度
     */
    @Column(name = "serviceScore")
    private Double servicescore;

    /**
     * 商品评分
     */
    @Column(name = "foodScore")
    private Double foodscore;

    /**
     * 排行
     */
    @Column(name = "rankRate")
    private Double rankrate;

    /**
     * 起送价
     */
    @Column(name = "minPrice")
    private Double minprice;

    /**
     * 商家配送费
     */
    @Column(name = "deliveryPrice")
    private Double deliveryprice;

    /**
     * 全部评价
     */
    @Column(name = "ratingCount")
    private Integer ratingcount;

    /**
     * 月售单数
     */
    @Column(name = "sellCount")
    private Integer sellcount;

    /**
     * 公告
     */
    private String bulletin;

    /**
     * 获取商家编号
     *
     * @return id - 商家编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置商家编号
     *
     * @param id 商家编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商家名称
     *
     * @return name - 商家名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商家名称
     *
     * @param name 商家名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取营业额
     *
     * @return turnover - 营业额
     */
    public Double getTurnover() {
        return turnover;
    }

    /**
     * 设置营业额
     *
     * @param turnover 营业额
     */
    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    /**
     * 获取商家电话
     *
     * @return phone - 商家电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置商家电话
     *
     * @param phone 商家电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取商家地址
     *
     * @return address - 商家地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置商家地址
     *
     * @param address 商家地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取营业时间
     *
     * @return time - 营业时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置营业时间
     *
     * @param time 营业时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取商家菜品品类
     *
     * @return sort - 商家菜品品类
     */
    public String getSort() {
        return sort;
    }

    /**
     * 设置商家菜品品类
     *
     * @param sort 商家菜品品类
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
     * 获取到达时间
     *
     * @return deliveryTime - 到达时间
     */
    public String getDeliverytime() {
        return deliverytime;
    }

    /**
     * 设置到达时间
     *
     * @param deliverytime 到达时间
     */
    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    /**
     * 获取综合分数
     *
     * @return score - 综合分数
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置综合分数
     *
     * @param score 综合分数
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 获取服务态度
     *
     * @return serviceScore - 服务态度
     */
    public Double getServicescore() {
        return servicescore;
    }

    /**
     * 设置服务态度
     *
     * @param servicescore 服务态度
     */
    public void setServicescore(Double servicescore) {
        this.servicescore = servicescore;
    }

    /**
     * 获取商品评分
     *
     * @return foodScore - 商品评分
     */
    public Double getFoodscore() {
        return foodscore;
    }

    /**
     * 设置商品评分
     *
     * @param foodscore 商品评分
     */
    public void setFoodscore(Double foodscore) {
        this.foodscore = foodscore;
    }

    /**
     * 获取排行
     *
     * @return rankRate - 排行
     */
    public Double getRankrate() {
        return rankrate;
    }

    /**
     * 设置排行
     *
     * @param rankrate 排行
     */
    public void setRankrate(Double rankrate) {
        this.rankrate = rankrate;
    }

    /**
     * 获取起送价
     *
     * @return minPrice - 起送价
     */
    public Double getMinprice() {
        return minprice;
    }

    /**
     * 设置起送价
     *
     * @param minprice 起送价
     */
    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    /**
     * 获取商家配送费
     *
     * @return deliveryPrice - 商家配送费
     */
    public Double getDeliveryprice() {
        return deliveryprice;
    }

    /**
     * 设置商家配送费
     *
     * @param deliveryprice 商家配送费
     */
    public void setDeliveryprice(Double deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    /**
     * 获取全部评价
     *
     * @return ratingCount - 全部评价
     */
    public Integer getRatingcount() {
        return ratingcount;
    }

    /**
     * 设置全部评价
     *
     * @param ratingcount 全部评价
     */
    public void setRatingcount(Integer ratingcount) {
        this.ratingcount = ratingcount;
    }

    /**
     * 获取月售单数
     *
     * @return sellCount - 月售单数
     */
    public Integer getSellcount() {
        return sellcount;
    }

    /**
     * 设置月售单数
     *
     * @param sellcount 月售单数
     */
    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
    }

    /**
     * 获取公告
     *
     * @return bulletin - 公告
     */
    public String getBulletin() {
        return bulletin;
    }

    /**
     * 设置公告
     *
     * @param bulletin 公告
     */
    public void setBulletin(String bulletin) {
        this.bulletin = bulletin;
    }
}