package com.konzil.intelligence.deploy.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* @ClassName: IntelligenceDeployViewConfig
* @Author: KONZIL
* @description: web配置
* @date: 2019-03-28
*/
@Configuration
public class IntelligenceDeployViewConfig implements WebMvcConfigurer {
    /**
     * 静态资源映射1
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }
}
