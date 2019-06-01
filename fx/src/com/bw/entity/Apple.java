package com.bw.entity;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/31-22:04
 */
public class Apple<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Apple() {
    }

    public Apple(T t) {
        this.t = t;
    }

    public void eat(){
        System.out.println(t+"吃蛋炒饭!");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "t=" + t +
                '}';
    }
}
