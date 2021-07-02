package com.example.blogBase.interceptor;

import com.example.webblog.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BlogInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(getClass());
    //false为拦截   true放行
    //目标方法执行前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        logger.info("载入我的拦截器");

        //发布文章之前进行session校验是否   是管理员操作
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("admin");
        if(user != null){
            logger.info("成功通过我的拦截器，正常进入");
            return true;
        }
        //拦截住不正常的请求
        logger.info("成功拦截这个非法请求");

        return false;
    }


    //目标方法执行完以后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    //页面渲染完以后
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
