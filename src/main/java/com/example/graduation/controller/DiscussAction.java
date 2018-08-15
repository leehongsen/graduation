package com.example.graduation.controller;

import com.example.graduation.pojo.TRatings;
import com.example.graduation.service.RatingService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ratings")
public class DiscussAction {
    @Resource
    private RatingService ratingService;

    @RequestMapping
    public Map<String,Object> getAll(TRatings ratings, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<TRatings> pageInfo = ratingService.selectByPage(ratings, start, length);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/add")
    public String add(TRatings ratings) {
        int r = ratingService.save(ratings);
        if(r>0)
            return "success";
        return "fail";
    }

    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        try{
            ratingService.delete(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
}
