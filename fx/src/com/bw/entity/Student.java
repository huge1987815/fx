package com.bw.entity;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-21:56
 */
public class Student{
    private int sid;
    private String sname;
    private int age;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int sid, String sname, int age) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
    }

    public Student() {
    }

    public Student(String sname, int age) {
        this.sname = sname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
