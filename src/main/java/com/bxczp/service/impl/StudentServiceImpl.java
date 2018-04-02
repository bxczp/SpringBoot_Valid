package com.bxczp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bxczp.Dao.StudentDao;
import com.bxczp.entity.Student;
import com.bxczp.service.StudentService;

//这里需要用到service注解来生成beam
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    
    @Resource
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {
        studentDao.save(student);
    }

}
