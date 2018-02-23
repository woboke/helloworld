package com.edianedi.DesignPatterns.AdaterPatterns;

import java.util.Map;

/**
 * Created by jls on 2018/2/23.
 * 适配器类
 */
public class OuterUserInfo implements IUserInfo{
    //源目标对象
    private IOuterUserBaseInfo outerUserBaseInfo =null;
    private IOuterUserHomeInfo outerUserHomeInfo=null;
    private IOuterUserOfficeInfo outerUserOfficeInfo =null;

    //数据处理
    private Map baseMap=null;
    private  Map homeMap=null;
    private  Map officeMap=null;

    //构造函数 传递对象
    public OuterUserInfo (IOuterUserBaseInfo _outerUserBaseInfo,IOuterUserHomeInfo _outerUserHomeInfo,IOuterUserOfficeInfo _outerUserOfficeInfo){
        this.outerUserBaseInfo=_outerUserBaseInfo;
        this.outerUserHomeInfo=_outerUserHomeInfo;
        this.outerUserOfficeInfo=_outerUserOfficeInfo;

        this.baseMap=this.outerUserBaseInfo.getUserBaseInfo();
        this.homeMap=this.outerUserHomeInfo.getUserHomeInfo();
        this.officeMap=this.outerUserOfficeInfo.getUserOfficeInfo();

    }


    public String getUserName() {
        String userName = (String )this.baseMap.get("userName");
        return userName;
    }

    public String getHomeAddress() {
        String homeAddress = (String )this.homeMap.get("address");
        return homeAddress;
    }

    public String getMobileNumber() {
        String mobileNumber = (String )this.baseMap.get("mobileNumber");
        return mobileNumber;
    }

    public String getOfficeAddress() {
        String officeAddress = (String )this.officeMap.get("officeAdress");
        return officeAddress;
    }
}
