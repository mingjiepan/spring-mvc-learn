package com.mjie.config;

import com.mjie.handler.AccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.function.support.RouterFunctionMapping;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.MappedInterceptor;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

import java.util.List;

/**
 * @author panmingjie
 * @date 2021/4/2 10:16
 */
@Configuration
public class myWebConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        /*InterceptorRegistration registration = registry.addInterceptor(new AccessHandler());
        registration.addPathPatterns("/hello/**");
        registration.excludePathPatterns("/article/**");*/

        registry.addInterceptor(new MappedInterceptor(new String[]{"/hello/**"}, new String[]{"/article/**"} ,new AccessHandler()));
        super.addInterceptors(registry);
    }

    @Override
    public RouterFunctionMapping routerFunctionMapping(FormattingConversionService conversionService, ResourceUrlProvider resourceUrlProvider) {
        return null;
    }

    @Override
    public BeanNameUrlHandlerMapping beanNameHandlerMapping(FormattingConversionService conversionService, ResourceUrlProvider resourceUrlProvider) {
        return null;
    }

    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
        super.extendMessageConverters(converters);
    }

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
    }
}
