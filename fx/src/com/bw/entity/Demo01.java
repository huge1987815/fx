package com.bw.entity;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/6/1-8:03
 */
public interface Demo01<T> {
    T save();
    T delete();
    T update();
    T select();
}
