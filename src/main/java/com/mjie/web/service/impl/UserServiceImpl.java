package com.mjie.web.service.impl;

import com.mjie.beans.Student;
import com.mjie.web.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author panmingjie
 * @date 2021/4/1 11:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public Student getStudent(int age) {
        Student student = new Student();
        student.setName("test");
        student.setAge(10);
        return student;
    }

    @Override
    public void delete(String name) {
        System.out.println("delete student name " + name);
    }
}
