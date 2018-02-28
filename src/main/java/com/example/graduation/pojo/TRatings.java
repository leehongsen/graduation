package com.example.graduation.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_ratings")
public class TRatings {
    /**
     * 评价编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 评论的时间戳
     */
    @Column(name = "rateTime")
    private Date ratetime;

    /**
     * 评论的顾客id
     */
    @Column(name = "customers_id")
    private Integer customersId;

    /**
     * 交货时间（多少分钟之内）
     */
    @Column(name = "deliveryTime")
    private Integer deliverytime;

    /**
     * 分数
     */
    private Double score;

    /**
     * 评论类型 0表示好评 1表示差评
     */
    @Column(name = "rateType")
    private Integer ratetype;

    /**
     * 评论内容
     */
    private String text;

    /**
     * 评论订单
     */
    @Column(name = "orders_id")
    private Integer ordersId;

    /**
     * 获取评价编号
     *
     * @return id - 评价编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置评价编号
     *
     * @param id 评价编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取评论的时间戳
     *
     * @return rateTime - 评论的时间戳
     */
    public Date getRatetime() {
        return ratetime;
    }

    /**
     * 设置评论的时间戳
     *
     * @param ratetime 评论的时间戳
     */
    public void setRatetime(Date ratetime) {
        this.ratetime = ratetime;
    }

    /**
     * 获取评论的顾客id
     *
     * @return customers_id - 评论的顾客id
     */
    public Integer getCustomersId() {
        return customersId;
    }

    /**
     * 设置评论的顾客id
     *
     * @param customersId 评论的顾客id
     */
    public void setCustomersId(Integer customersId) {
        this.customersId = customersId;
    }

    /**
     * 获取交货时间（多少分钟之内）
     *
     * @return deliveryTime - 交货时间（多少分钟之内）
     */
    public Integer getDeliverytime() {
        return deliverytime;
    }

    /**
     * 设置交货时间（多少分钟之内）
     *
     * @param deliverytime 交货时间（多少分钟之内）
     */
    public void setDeliverytime(Integer deliverytime) {
        this.deliverytime = deliverytime;
    }

    /**
     * 获取分数
     *
     * @return score - 分数
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置分数
     *
     * @param score 分数
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 获取评论类型 0表示好评 1表示差评
     *
     * @return rateType - 评论类型 0表示好评 1表示差评
     */
    public Integer getRatetype() {
        return ratetype;
    }

    /**
     * 设置评论类型 0表示好评 1表示差评
     *
     * @param ratetype 评论类型 0表示好评 1表示差评
     */
    public void setRatetype(Integer ratetype) {
        this.ratetype = ratetype;
    }

    /**
     * 获取评论内容
     *
     * @return text - 评论内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置评论内容
     *
     * @param text 评论内容
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取评论订单
     *
     * @return orders_id - 评论订单
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * 设置评论订单
     *
     * @param ordersId 评论订单
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }
}