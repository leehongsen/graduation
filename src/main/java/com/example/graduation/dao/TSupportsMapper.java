package com.example.graduation.dao;

import com.example.graduation.pojo.TSupports;
import com.example.graduation.util.MyMapper;

import java.util.List;

public interface TSupportsMapper extends MyMapper<TSupports> {
    List<TSupports> querySupportListWithSelected(Integer id);
}