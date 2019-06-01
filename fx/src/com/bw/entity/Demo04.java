package com.bw.entity;


import sun.rmi.runtime.Log;

import java.util.List;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/6/1-9:37
 */
public class Demo04 {
    public static void main(String[] args) {
        Apple<String> a1=new Apple<>("红苹果");
        Apple<Integer> a2=new Apple<>(23);
        //show(a1);
        show(a2);
        Apple<Number> a3=new Apple<>(45);
        show2(a3);
        show3(a1);
    }
    //在泛型方法上添加上下边界
    public static <T extends String> T show3(Apple<T> a){
        return a.getT();
    }
    //下界:包含本身及父类
    private static void show2(Apple<? super Integer> apple) {
        System.out.println(apple.getT());
    }


    //上界：包含本身及它子类
    public static void show(Apple<? extends Number> apple){
        System.out.println("泛型测试"+apple.getT());
    }
}
