package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_customers")
public class TCustomers {
    /**
     * 客户编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 消费金额
     */
    private Double consumption;

    /**
     * 客户电话
     */
    private String phone;

    /**
     * 客户地址
     */
    private String address;

    /**
     * 获取客户编号
     *
     * @return id - 客户编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置客户编号
     *
     * @param id 客户编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取客户姓名
     *
     * @return name - 客户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置客户姓名
     *
     * @param name 客户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取消费金额
     *
     * @return consumption - 消费金额
     */
    public Double getConsumption() {
        return consumption;
    }

    /**
     * 设置消费金额
     *
     * @param consumption 消费金额
     */
    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    /**
     * 获取客户电话
     *
     * @return phone - 客户电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置客户电话
     *
     * @param phone 客户电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取客户地址
     *
     * @return address - 客户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置客户地址
     *
     * @param address 客户地址
     */
    public void setAddress(String address) {
        this.address = address;
    }
}