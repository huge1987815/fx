package com.bw.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/6/1-8:28
 */
public class Demo02 implements Demo01<Student>{
    List<Student> list=null;

    public Demo02() {
        list=new ArrayList<>();
        Student s1=new Student(101,"张三",23);
        Student s2=new Student(102,"李四",24);
        Student s3=new Student(103,"王五",25);
        list.add(s1);list.add(s2);list.add(s3);
    }


    @Override
    public Student save() {
        Student s=new Student(105,"小明",25);
        return s;
    }

    @Override
    public Student delete() {
        return list.remove(0);
    }

    @Override
    public Student update() {
        Student student = list.get(0);
        if(student.getSname().equals("张三")){
            student.setSname("田七");
        }
        return student;
    }

    @Override
    public Student select() {
        return list.get(0);
    }
}
