package com.example.webblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.blogBase.model.BaseModel;
import com.example.blogBase.model.BusinessException;
import com.example.webblog.entity.Blog;
import com.example.webblog.mapper.BlogMapper;
import com.example.webblog.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    @Override
    public BaseModel<Blog> addBlog(Blog blog,BaseModel<Blog> baseModel) throws Exception {
        log.info("进入添加博客业务处理----------------");
        blog.setIsDelete(0);
        blog.setCreateTime(new Date());
        log.info("new的时间是什么----"+new Date());
        blog.setVersion(0);
        log.info("传入sql的对象----"+blog);
        int num = blogMapper.insert(blog);
        if(num<0){
            baseModel.setMessage("发布失败");
            baseModel.setCode(0);
            throw new BusinessException(7001,"发布文章失败");
        }
        baseModel.setMessage("成功发布");
        baseModel.setCode(1);
        log.info("是否发布成功信息---------:"+baseModel);
        return baseModel;
    }

    @Override
    public BaseModel<Blog> selectById(int id, BaseModel<Blog> baseModel) throws Exception {
        log.info("进入对应查询id的业务需求---------------");
        QueryWrapper<Blog> wrapper = new QueryWrapper();
        wrapper.eq("is_delete",0).eq("blog_id",id);
        Blog blog = blogMapper.selectOne(wrapper);
        if (blog==null){
            throw new BusinessException(7002,"该博客已经不存在");
        }
        baseModel.setMessage("成功查询到这篇博客");
        baseModel.setCode(1);
        baseModel.setData(blog);
        log.info("已查询到对应id的业务对象------"+blog);
        return baseModel;
    }

    @Override
    public BaseModel<List<Blog>> selectAll(BaseModel baseModel) throws Exception {
        QueryWrapper<Blog> queryWrapper = new QueryWrapper();
        queryWrapper.eq("is_delete",0);
        List<Blog> list = blogMapper.selectList(queryWrapper);
        baseModel.setData(list);
        baseModel.setCode(1);
        baseModel.setMessage("查询所有博客成功");
        log.info("是否查询到信息---------:"+baseModel);
        return baseModel;
    }


}
