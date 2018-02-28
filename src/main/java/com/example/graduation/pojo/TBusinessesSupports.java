package com.example.graduation.pojo;

import javax.persistence.*;

@Table(name = "t_businesses_supports")
public class TBusinessesSupports {
    /**
     * 商家id
     */
    @Column(name = "businesses_id")
    private Integer businessesId;

    /**
     * 服务优惠id
     */
    @Column(name = "supports_id")
    private Integer supportsId;

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
     * 获取服务优惠id
     *
     * @return supports_id - 服务优惠id
     */
    public Integer getSupportsId() {
        return supportsId;
    }

    /**
     * 设置服务优惠id
     *
     * @param supportsId 服务优惠id
     */
    public void setSupportsId(Integer supportsId) {
        this.supportsId = supportsId;
    }
}