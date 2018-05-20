package com.example.graduation.controller;


import com.example.graduation.pojo.TUser;
import com.example.graduation.util.Encrypt;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeAction {
    /*控制页面跳转*/
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, TUser user){
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            request.setAttribute("msg", "用户名或密码不能为空！");
            return "login";
        }
        /*user.setPassword(Encrypt.MD5(user.getPassword()));*/
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            subject.login(token);
            return "redirect:usersPage";
        } catch (LockedAccountException lae) {
            token.clear();
            request.setAttribute("msg", "用户已经被锁定不能登录，请与管理员联系！");
            return "login";
        } catch (AuthenticationException e) {
            token.clear();
            request.setAttribute("msg", "用户或密码不正确！");
            return "login";
        }
    }

    @RequestMapping(value={"/usersPage",""})
    public String usersPage(){
        return "user/users";
    }

    @RequestMapping("/rolesPage")
    public String rolesPage(){
        return "role/roles";
    }

    @RequestMapping("/resourcesPage")
    public String resourcesPage(){
        return "resources/resources";
    }

    @RequestMapping("/sellerPage")
    public String sellerPage(){
        return "seller/seller";
    }

    @RequestMapping("/orderPage")
    public String orderPage(){
        return "order/order";
    }

    @RequestMapping("/goodsPage")
    public String goodsPage(){
        return "goods/goods";
    }

    @RequestMapping("/403")
    public String forbidden(){
        return "403";
    }
    /*控制页面跳转 end*/

    @RequestMapping("/sellerTest")
    @ResponseBody
    public Map<String,String> seller(HttpServletRequest request,HttpServletResponse response){
        String Origin=request.getHeader("Origin");
        response.addHeader("Access-Control-Allow-Origin",Origin);
        Map<String,String> map=new HashMap<>();
        map.put("name","肯德基");
        map.put("addr","重庆");
        return map;
    }
}