package com.mjie.handler;

import com.mjie.common.BaseResp;
import com.mjie.exception.ServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * ExceptionHandlerMethodResolver
 *
 * 先获取注解ControllerAdvice的beanName
 * 内部 维护一个map
 * map的key为Exception的Class对象，value为Method对象，如下面两个方法
 * map.put(Exception.class, method)
 * map.put(ServiceException.class, method)
 * @author panmingjie
 * @date 2021/4/2 10:04
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ServiceException.class)
    public BaseResp serviceException(ServiceException serviceException) {
        System.out.println("service exception" + serviceException.getMessage());
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(333);
        baseResp.setMsg("error msg");
        return baseResp;
    }
    @ExceptionHandler(value = Exception.class)
    public BaseResp exception(Exception exception) {
        System.out.println("global exception");
        System.out.println("service exception" + exception.getMessage());
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(111);
        baseResp.setMsg("global error msg");
        return baseResp;
    }
}
