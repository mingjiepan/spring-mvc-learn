package com.mjie.config;

import com.mjie.beans.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author panmingjie
 * @date 2021/4/2 16:18
 */
@Component
@Order(value = 2)
public class AppComponent {


    @Bean
    public Teacher teacher() {
        return new Teacher();
    }


}
