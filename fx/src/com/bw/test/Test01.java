package com.bw.test;

import com.bw.entity.Apple;
import com.bw.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-22:00
 */
public class Test01 {
    public static void main(String[] args) {
        method03();
    }

    private static void method03() {
        //写一个集合
        List<String> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        Class<? extends List> aClass = list.getClass();
        Class<? extends List> aClass1 = list1.getClass();
        if(aClass.equals(aClass1)){
            System.out.println("泛型测试:类型相同!");
        }
        /*
        * 通过上面的例子可以证明，在编译之后程序会采取去泛型化的措施。
        * 也就是说Java中的泛型，只在编译阶段有效。
        * 在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦出，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。
        * 也就是说，泛型信息不会进入到运行时阶段
        * 对此总结成一句话：泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型。
        * */
    }

    private static void method02() {
        Apple<String> a1=new Apple<String>("小明");
        Apple<Integer> a2=new Apple<Integer>(12);
        System.out.println(a1+","+a2);
        a1.eat();
        a2.eat();
    }

    private static void method01() {
        //写一个集合
        List<String> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
    }
}
