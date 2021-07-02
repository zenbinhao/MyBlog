package com.example.webblog;

import com.example.webblog.entity.User;
import com.example.webblog.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class WebBlogApplicationTests {

    @Autowired
    UserMapper userMapper;

    Logger log = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("id",1);
        map.put("pwd",123);
        List<User> list = userMapper.selectByMap(map);
        log.info("通过日志输出------"+list);
    }

}
