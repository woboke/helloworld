package com.edianedi.DesignPatterns.SingletonPattern;

/**
 * Created by jls on 2018/2/26.
 * 懒汉式，线程安全 可以使用这个
 * 但是并不高效 因为在任何时候只能有一个线程调用 getInstance() 方法
 */
public class Singleton2 {
    //创建一个私有的对象
    private static Singleton2 singleton;
    // 构造函数 私有的
    private Singleton2(){}

    //使用公共方法来获取对象 synchronized 保证线程安全
    public static synchronized Singleton2 getSingleton(){
        if(singleton==null){
            singleton= new Singleton2();
        }
        return singleton;
    }
}
