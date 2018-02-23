package com.edianedi.DesignPatterns.ProxyPattern.PP1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by jls on 2018/2/11.
 */
public class Client {
    public static void main(String args[]){
        //定义真正的婚礼者对象
        IMarry marryers=new MyMarry();
        marryers.getNames("张楚岚","冯宝宝");
        marryers.procedure();
        //定义一个Handler
        InvocationHandler handler= new TakeMarryIH(marryers);
        //婚礼现场开始 记下时间戳
        System.out.println("开始时间:2018-02-11 17:36:35");
        //获得类的class loader
        ClassLoader classLoader=marryers.getClass().getClassLoader();
        //动态产生一个代理者-婚庆公司主持人
        IMarry proxy= (IMarry) Proxy.newProxyInstance(classLoader,new Class[]{IMarry.class},handler);

        //获取新郎新娘名字
        proxy.getNames("张楚岚","冯宝宝");
        //开始典礼
        proxy.procedure();
        //典礼结束 记录时间戳
        System.out.println("结束时间:2018-02-11 17:41:35");
    }
}
