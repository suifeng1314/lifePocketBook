package com.cashbook.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: longtao
 * @Date: 2019/5/22 23:47
 * @Description: 2.1版本拦截器 实现WebMvcConfigurer接口
 */
//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInterceptor()).addPathPatterns("/**")
            .excludePathPatterns("/swagger-ui.html");

    }
}
