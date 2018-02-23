package com.edianedi.DesignPatterns.AdaterPatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jls on 2018/2/23.
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{
    public Map getUserOfficeInfo() {
        HashMap userOfiiceInfo= new HashMap();
        userOfiiceInfo.put("officeAdress","北京西二旗");
        System.out.println("外包人员工作信息完成");
        return userOfiiceInfo;
    }
}
