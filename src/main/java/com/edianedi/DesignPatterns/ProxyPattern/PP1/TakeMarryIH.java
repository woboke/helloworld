package com.edianedi.DesignPatterns.ProxyPattern.PP1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * Created by jls on 2018/2/11.
 */
public class TakeMarryIH implements InvocationHandler {
    //被代理者
    Class cls=null;
    //被代理的实例
    Object object=null;
    //我要代理谁
    public TakeMarryIH(Object obj){
        this.object=obj;
    }
    //调用被代理者的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object,args);
        return result;
    }
}
