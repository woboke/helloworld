package com.edianedi.DesignPatterns.SingletonPattern;

/**
 * Created by jls on 2018/2/26.
 * 双重检验锁模式
 *
 */
public class Singleton3 {
    //创建一个私有的对象 volatile确保 指令重排序优化
    private volatile static Singleton3 singleton;
    // 构造函数 私有的
    private Singleton3(){}

    //使用公共方法来获取对象 双重检验锁
    public static  Singleton3 getSingleton(){
        if(singleton==null){
            synchronized (Singleton3.class){
                if(singleton==null) {
                    singleton = new Singleton3();
                }
            }

        }
        return singleton;
    }
}
