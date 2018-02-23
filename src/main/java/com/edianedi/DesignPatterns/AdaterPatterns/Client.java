package com.edianedi.DesignPatterns.AdaterPatterns;

/**
 * Created by jls on 2018/2/23.
 * 场景类
 */
public class Client {
    public static void main(String args[]){

        //源目标对象
         IOuterUserBaseInfo outerUserBaseInfo =new OuterUserBaseInfo();
         IOuterUserHomeInfo outerUserHomeInfo=new OuterUserHomeInfo();
         IOuterUserOfficeInfo outerUserOfficeInfo =new OuterUserOfficeInfo();
         //传递对象
         IUserInfo youngGirl=new OuterUserInfo(outerUserBaseInfo,outerUserHomeInfo,outerUserOfficeInfo);

             System.out.println(youngGirl.getMobileNumber());

    }
}
