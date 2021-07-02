package com.example.blogBase.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

// 封装文件上传数据 实体类
@Data
public class LoadingModel {
    // 文件上传接收到的二进制流 以及 文件名称
    private MultipartFile[] loadFile;
    // 文件存储的地址
    private String filesAddressList;
}
