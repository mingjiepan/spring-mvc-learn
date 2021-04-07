package com.mjie.web;

import com.mjie.beans.Student;
import com.mjie.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author panmingjie
 * @date 2021/4/1 10:58
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/getStudent", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Student getStudent(@RequestParam(required = false) Integer age) {
        age = 19;
        return userService.getStudent(age);
    }

    public void deleteStudent(@RequestParam(required = false) String name) {
        userService.delete(name);
    }
}
