package com.example.webblog.service;

import com.example.blogBase.model.BaseModel;
import com.example.webblog.entity.Blog;

import java.util.List;

public interface BlogService {
    public BaseModel<Blog> addBlog(Blog blog, BaseModel<Blog> baseModel) throws Exception;

    public BaseModel<List<Blog>> selectAll(BaseModel baseModel) throws Exception;

    public BaseModel<Blog> selectById(int id, BaseModel<Blog> baseModel) throws Exception;
    
}
