package com.edianedi.DesignPatterns.SingletonPattern;

/**
 * Created by jls on 2018/2/26.
 * 枚举类型
 * 在这里需要记住一件事情 当序列化枚举的时候，字段变量不能被序列化，如该枚举类中的values变量 序列化的时候将会被丢失。
 */
public enum Singleton6 {
    SINGLETON;
    private Singleton6(){
        System.out.println("运行代码喽***");
    }
    int values;
    public int getValues(){
        return values;
    }

    public void setValues(int values){
        this.values=values;
    }
}

 class Test {
    public static void main(String[] args) {
        /** 结果如下：
         * 运行代码喽***
         * true
         */
        Singleton6 singleton1 = Singleton6.SINGLETON;
        Singleton6 singleton2 = Singleton6.SINGLETON;
        System.out.println(singleton1==singleton2);

        /** 结果如下：
         * 0
         * 2
         */
        System.out.println(singleton1.getValues());
        singleton1.setValues(2);
        System.out.println(singleton1.getValues());
    }
}
