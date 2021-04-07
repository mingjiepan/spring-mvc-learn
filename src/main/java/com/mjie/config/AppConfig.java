package com.mjie.config;

import com.mjie.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author panmingjie
 * @date 2021/4/1 10:57
 */
@Configuration
//@EnableWebMvc
@Order(value = 3)
@ComponentScan(basePackages = {"com.mjie"})
public class AppConfig {
    @Bean
    public Student student() {
        Student student = new Student();
        student.setAge(10);
        student.setName("mjie");
        return student;
    }
}
