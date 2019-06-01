package com.bw.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/6/1-10:01
 */
public class Demo05 {
    public static void main(String[] args) {
        method02();
    }

    private static void method02() {
        List<?>[] l=new ArrayList<?>[10];
        Object oj=l;
        Object[] oa= (Object[]) oj;
        List<String> list=new ArrayList<>();
        list.add("小明");
        oa[1]=list;
        String s=(String)l[1].get(0);
        System.out.println(s);
    }

    //泛型数组
    private static void method01() {
        //List<String>[] larr=new ArrayList<String>[10];是不可以写的
        List<?>[] larr=new ArrayList<?>[10];//这是可以的
        List<String>[] larr01=new ArrayList[10];//这是可以的
        /**
         * 这种情况下，由于JVM泛型的擦除机制，在运行时JVM是不知道泛型信息的，所以可以给oa[1]赋上一个ArrayList而不会出现异常，
         *
         * 但是在取出数据的时候却要做一次类型转换，所以就会出现ClassCastException，如果可以进行泛型数组的声明，
         *
         * 上面说的这种情况在编译期将不会出现任何的警告和错误，只有在运行时才会出错。
         *
         * 而对泛型数组的声明进行限制，对于这样的情况，可以在编译期提示代码有类型安全问题，比没有任何提示要强很多。
         *
         * */
    }
}
