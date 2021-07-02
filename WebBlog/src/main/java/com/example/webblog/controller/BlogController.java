package com.example.webblog.controller;

import com.example.blogBase.model.BaseModel;
import com.example.webblog.entity.Blog;
import com.example.webblog.service.impl.BlogServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogServiceImpl blogService;

    @PostMapping("/add")
    public BaseModel<Blog> addBlog(Blog blog, BaseModel<Blog> baseModel)throws Exception{
        log.info("进入添加博客文章的请求----------------");
        return blogService.addBlog(blog,baseModel);
    }
    @GetMapping("/selectAll")
    public BaseModel<List<Blog>> selectAll(BaseModel<Blog> baseModel)throws Exception{
        log.info("进入查询博客文章的请求----------------");
        return blogService.selectAll(baseModel);
    }
    @GetMapping("/selectById")
    public BaseModel<Blog> selectById(@RequestParam("id") int id, BaseModel<Blog> baseModel)throws Exception{
        log.info("进入对应查询id展示的请求---------------");
        return blogService.selectById(id,baseModel);
    }

}
