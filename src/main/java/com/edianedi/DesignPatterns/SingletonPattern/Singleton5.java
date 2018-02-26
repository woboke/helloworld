package com.edianedi.DesignPatterns.SingletonPattern;

/**
 * Created by jls on 2018/2/26.
 *
 * 静态内部类
 * 我比较倾向于使用静态内部类的方法
 */
public class Singleton5 {
    //创建一个静态内部类
    private static class SingletonHolder{
        private  static final Singleton5 singleton= new Singleton5();
    }
    //私有的构造函数
    private  Singleton5(){}
    private  static  final Singleton5 getSingleton(){
        return  SingletonHolder.singleton;
    }
}
