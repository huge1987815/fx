package com.bw.zj;

import java.lang.reflect.Method;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-18:03
 */
public class TestAnnotation {
    public static void main(String[] args) throws Exception{
        //写一个运行时的类
        Class c=Student.class;
        //获取方法
        Method study = c.getMethod("study", int.class);
        //判断
        if(study.isAnnotationPresent(Stu.class)){
            System.out.println("Student类上面配置Stu注解!");
            //获取注解
            Stu stu=study.getAnnotation(Stu.class);
            System.out.println(stu.sname()+","+stu.age()+","+stu.score()[0]);
        }else{
            System.out.println("Student类上面没有配置Stu注解!");
        }
    }
}
