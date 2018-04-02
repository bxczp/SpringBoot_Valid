package com.bxczp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bxczp.entity.Student;

//这里没有用到注解@Repository("") 因为这里继承了特殊类，所以spring会自动把它当成一个bean注入
public interface StudentDao extends JpaRepository<Student, Integer> {
    
    

}
