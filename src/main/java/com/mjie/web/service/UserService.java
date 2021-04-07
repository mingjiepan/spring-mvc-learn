package com.mjie.web.service;

import com.mjie.beans.Student;

/**
 * @author panmingjie
 * @date 2021/4/1 10:59
 */
public interface UserService {

    Student getStudent(int age);

    void delete(String name);
}
