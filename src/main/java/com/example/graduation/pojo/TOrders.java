package com.example.graduation.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_orders")
public class TOrders implements Serializable {
    private static final long serialVersionUID = -7281967752352098051L;
    /**
     * 订单编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订购时间
     */
    @Column(name = "order_time")
    private Date orderTime;

    /**
     * 客户编号
     */
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 商家编号
     */
    @Column(name = "businesses_id")
    private Integer businessesId;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 总额
     */
    @Column(name = "total_cost")
    private Double totalCost;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 获取订单编号
     *
     * @return id - 订单编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置订单编号
     *
     * @param id 订单编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订购时间
     *
     * @return order_time - 订购时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置订购时间
     *
     * @param orderTime 订购时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取客户编号
     *
     * @return customer_id - 客户编号
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户编号
     *
     * @param customerId 客户编号
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
     * 获取数量
     *
     * @return number - 数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置数量
     *
     * @param number 数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取总额
     *
     * @return total_cost - 总额
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * 设置总额
     *
     * @param totalCost 总额
     */
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }
}