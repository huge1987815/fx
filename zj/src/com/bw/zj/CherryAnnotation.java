package com.bw.zj;

import java.lang.annotation.*;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-14:09
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CherryAnnotation {
    String name();
    int age() default 23;
    int[] array();
}
