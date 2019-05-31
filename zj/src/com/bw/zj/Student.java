package com.bw.zj;
/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-16:50
 */
public class Student {
    @Stu(sname="张三",age=23,score={70,90,85})
    public static void study(int times){
        for (int i = 0; i <times ; i++) {
            System.out.println("good good study,day day up!");
        }
    }
}
