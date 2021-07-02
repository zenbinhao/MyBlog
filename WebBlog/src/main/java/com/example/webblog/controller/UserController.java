package com.example.webblog.controller;

import com.example.blogBase.model.BaseModel;
import com.example.webblog.entity.User;
import com.example.webblog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public BaseModel<User> loginAdmin(@RequestParam("pwd") String pwd , BaseModel<User> baseModel, HttpServletRequest httpServletRequest){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("pwd",pwd);
        map.put("id",1);
        baseModel.setCode(200);
        baseModel.setMessage("登录成功");
        baseModel.setData(userMapper.selectByMap(map).get(0));
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("admin",userMapper.selectByMap(map).get(0));
        return baseModel;
    }
}
