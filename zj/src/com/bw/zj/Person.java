package com.bw.zj;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-10:49
 */
public interface Person {
    String eat();
    String sleep();

    @Deprecated//不是所有人都使用
    void song();
}
