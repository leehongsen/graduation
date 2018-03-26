package com.example.graduation.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_businesses_supports")
public class TBusinessesSupports implements Serializable {
    private static final long serialVersionUID = -6176748105837418632L;
    /**
     * 商家id
     */
    @Column(name = "businesses_id")
    private Integer businessesId;

    /**
     * 服务优惠id
     */
    @Column(name = "supports_id")
    private String supportsId;

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
    public TBusinessesSupports setBusinessesId(Integer businessesId) {
        this.businessesId = businessesId;
        return this;
    }

    /**
     * 获取服务优惠id
     *
     * @return supports_id - 服务优惠id
     */
    public String getSupportsId() {
        return supportsId;
    }

    /**
     * 设置服务优惠id
     *
     * @param supportsId 服务优惠id
     */
    public TBusinessesSupports setSupportsId(String supportsId) {
        this.supportsId = supportsId;
        return this;
    }
}