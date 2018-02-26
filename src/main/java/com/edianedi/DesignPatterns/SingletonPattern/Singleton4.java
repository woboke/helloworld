package com.edianedi.DesignPatterns.SingletonPattern;

/**
 * Created by jls on 2018/2/26.
 * 饿汉式
 * 饿汉式的创建方式在一些场景中将无法使用：譬如 Singleton 实例的创建是依赖参数或者配置文件的
 */
public class Singleton4 {
    //创建一个私有的对象
    private static final Singleton4 singleton = new Singleton4();
    // 构造函数 私有的
    private Singleton4(){}

    //使用公共方法来获取对象
    public static  Singleton4 getSingleton(){
        return singleton;
    }
}
