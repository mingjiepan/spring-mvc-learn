package com.mjie.config;

import com.mjie.handler.AccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author panmingjie
 * @date 2021/4/2 10:16
 */
@Configuration
public class myWebConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AccessHandler());
        super.addInterceptors(registry);
    }

    @Override
    protected PathMatchConfigurer getPathMatchConfigurer() {
        return new PathMatchConfigurer();
    }
}
