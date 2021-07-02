package com.example.blogBase.model;

import lombok.Data;

@Data
public class BaseModel<T>{
    private int code;
    private T data;
    private String message;
}
