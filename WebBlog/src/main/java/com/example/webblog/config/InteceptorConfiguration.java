package com.example.webblog.config;

import com.example.blogBase.interceptor.BlogInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InteceptorConfiguration implements WebMvcConfigurer {

    Logger logger = LoggerFactory.getLogger(getClass());

    //通过bean在spring容器中注册拦截器
    @Bean
    public BlogInterceptor blogInterceptor(){
        return new BlogInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("加载拦截器");
        registry.addInterceptor(this.blogInterceptor()).addPathPatterns("/blog/add");
    }
}
