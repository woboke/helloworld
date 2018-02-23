package com.edianedi.DesignPatterns.ProxyPattern.PP2;

/**
 * Created by jls on 2018/2/12.
 * 真实的前置对象
 */
public class BeforeAdvice implements IAdvice {
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }
}
