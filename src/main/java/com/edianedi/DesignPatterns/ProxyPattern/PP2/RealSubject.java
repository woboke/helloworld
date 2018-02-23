package com.edianedi.DesignPatterns.ProxyPattern.PP2;

import javax.security.auth.*;

/**
 * Created by jls on 2018/2/11.
 * 真实主题
 */
public class RealSubject implements Subject {
    //业务操作
    public void doSomething(String str) {
        System.out.println("做一些事情-->"+str);
    }
}
