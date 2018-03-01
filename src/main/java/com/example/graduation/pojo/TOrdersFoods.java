package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_orders_foods")
public class TOrdersFoods implements Serializable {
    private static final long serialVersionUID = -8281414749295928875L;
    /**
     * 订单编号
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 食物编号
     */
    @Column(name = "foods_id")
    private Integer foodsId;

    /**
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取食物编号
     *
     * @return foods_id - 食物编号
     */
    public Integer getFoodsId() {
        return foodsId;
    }

    /**
     * 设置食物编号
     *
     * @param foodsId 食物编号
     */
    public void setFoodsId(Integer foodsId) {
        this.foodsId = foodsId;
    }
}