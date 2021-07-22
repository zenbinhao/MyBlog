package com.example.webblog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Blog implements Serializable {

    private static final long serialVersionUID = 594192936L;

    // 文章id
    private int blogId;
    // 文章主题
    private String title;
    // 文章内容
    private String context;
    // 文章创建时间
    private Date createTime;
    // 文章最后修改时间
    private Date updateTime;
    // 逻辑删除
    private int isDelete;
    // 防止误触 版本控制
    private int version;
    // 分类ID
    private int categoryId;
}
