package com.bw.entity;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/6/1-9:16
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        Student obj = getGeneric(Student.class);
        obj.setSid(101);
        obj.setSname("小花");
        obj.setAge(28);
        System.out.println(obj);
    }
    public static  <T> T getGeneric(Class<T> tClass) throws Exception{
        T t = tClass.newInstance();
        return t;
    }
}
