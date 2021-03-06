package com.example.graduation.controller;

import com.example.graduation.pojo.TGoods;
import com.example.graduation.service.GoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsAction {
    @Resource
    private GoodsService goodsService;

    @RequestMapping
    public Map<String,Object> getAll(TGoods goods, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<TGoods> pageInfo = goodsService.selectByPage(goods, start, length);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/add")
    public String add(TGoods goods) {
        int r = goodsService.save(goods);
        if(r>0)
            return "success";
        return "fail";
    }

    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        try{
            goodsService.delGoods(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
}
