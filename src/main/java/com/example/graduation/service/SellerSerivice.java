package com.example.graduation.service;

import com.example.graduation.pojo.TBusinesses;

import java.util.List;
import java.util.Map;

/**
 * 商家表
 */
public interface SellerSerivice extends IService<TBusinesses> {
    /**
     * 删除卖家，涉及到图片类、卖家联立其他表等
     * @param id
     */
    void delSeller(Integer id);
}
