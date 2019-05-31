package com.bw.zj;

import java.lang.annotation.*;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-16:49
 */
@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Stu {
    String sname();
    int age() default 19;
    int[] score();
}
