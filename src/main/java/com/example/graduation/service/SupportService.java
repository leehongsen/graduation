package com.example.graduation.service;

import com.example.graduation.pojo.TSupports;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 服务表
 */
public interface SupportService extends IService<TSupports> {
    /**
     * 删除服务，涉及到商家服务表
     * @param type
     */
    void delSupport(Integer type);

    PageInfo<TSupports> selectByPage(TSupports supports, int start, int length);

    TSupports selectByDescription(String description);

    List<TSupports> queryRoleListWithSelected(Integer id);
}
