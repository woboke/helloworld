package com.edianedi.DesignPatterns.SingletonPattern;

/**
 * Created by jls on 2018/2/26.
 * 懒汉式，线程不安全(当多个线程时会创建多个对象)  不推荐使用这种方式
 */
public class Singleton1 {
    //创建一个私有的对象
    private static Singleton1 singleton;
    // 构造函数 私有的
    private Singleton1(){}

    //使用公共方法来获取对象
    public static Singleton1 getSingleton(){
        if(singleton==null){
            singleton= new Singleton1();
        }
        return singleton;
    }
}
