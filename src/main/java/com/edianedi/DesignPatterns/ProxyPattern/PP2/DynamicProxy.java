package com.edianedi.DesignPatterns.ProxyPattern.PP2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by jls on 2018/2/12.
 * 动态代理类
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler){
        //寻找JoinPoint连接点。AOP框架使用元数据定义
        if(true){
            //执行一个前置通知--在执行具体的真实对象的方式之前
            (new BeforeAdvice()).exec();
        }
        //执行目标,并返回结果
        return (T) Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
