package com.bxczp.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bxczp.entity.Student;
import com.bxczp.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;
    
    @ResponseBody
    @RequestMapping("/add")
    // @Valid 注解要验证的数据 BindingResult 返回错误结果
    public String addStudent(@Valid Student student, BindingResult result) {
        if (result.hasErrors()) {
            // 如果有错误，返回错误信息，即 实体类中的message信息
           return result.getFieldError().getDefaultMessage();
        } else {
            studentService.addStudent(student);
            return "OK";
        }
    }
    
}
