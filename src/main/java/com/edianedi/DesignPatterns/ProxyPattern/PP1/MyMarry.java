package com.edianedi.DesignPatterns.ProxyPattern.PP1;

/**
 * Created by jls on 2018/2/11.
 */
public class MyMarry implements IMarry {
    public void getNames(String groomName, String brideName) {
        System.out.println("新郎:"+groomName +",新娘:"+brideName);
    }

    public void procedure() {
        System.out.println("一拜天地二拜高堂 夫妻对拜 送入洞房");

    }
}
