package com.edianedi.DesignPatterns.ProxyPattern.PP2;

import java.lang.reflect.InvocationHandler;

/**
 * Created by jls on 2018/2/12.
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject){

        //获得一个classloader
        ClassLoader loader= subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes =subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler=new MyInvocationHandler(subject);
        return newProxyInstance(loader,classes,handler);
    }
}
