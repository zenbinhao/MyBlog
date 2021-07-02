package com.example.blogBase.em;


//自定义  常量错误
public enum ExceptionEnum {
    SYS_ERROR(9999,"系统异常，请联系管理员");

    //错误代码
    private int code;
    //错误信息
    private String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
