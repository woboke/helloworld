package com.edianedi.DesignPatterns.ProxyPattern.PP2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jls on 2018/2/12.
 * 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler {

    //被代理的对象
    private Object target=null;
    //构造函数
    public MyInvocationHandler(Object object){
        this.target=object;
    }
    //代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法-- 所有通过动态代理实现的方法全部通过invoke方法来调用
        return method.invoke(this.target,args);
    }
}
