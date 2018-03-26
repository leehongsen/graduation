package com.example.graduation.controller;

import com.example.graduation.pojo.TSupports;
import com.example.graduation.service.SupportService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/support")
public class SupportAction {
    @Resource
    private SupportService supportService;

    @RequestMapping
    public Map<String,Object> getAll(TSupports supports, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<TSupports> pageInfo = supportService.selectByPage(supports, start, length);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/add")
    public String add(TSupports supports) {
        TSupports u = supportService.selectByDescription(supports.getDescription());
        if(u != null)
            return "error";
        int r = supportService.save(supports);
        if(r>0)
            return "success";
        return "fail";
    }

    @RequestMapping(value = "/delete")
    public String delete(Integer type){
        try{
            supportService.delSupport(type);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("/supportsWithSelected")
    public List<TSupports> supportsWithSelected(Integer id){
        return supportService.queryRoleListWithSelected(id);
    }
}
