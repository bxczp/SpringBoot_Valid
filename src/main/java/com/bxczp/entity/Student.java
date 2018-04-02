package com.bxczp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

@Entity
@Table(name="t_student")
public class Student {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    //Spring boot 验证注解
    @NotEmpty(message="name is empty")
    @Column(length=50)
    private String name;
    //推荐使用包装类
    @NotNull(message="age is empty")
    @Min(value=18, message="age is under 18")
    @Max(value=30, message="age is upon 30")
    @Column(name="age")
    private Integer age;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    

}
