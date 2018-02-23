package com.edianedi.DesignPatterns.AdaterPatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jls on 2018/2/23.
 * 实现外包人员基本信息类
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","刘三三");
        baseInfoMap.put("gender","男");
        baseInfoMap.put("mobileNumber","12345678911");
        System.out.println("外包人员基本信息完成");
        return baseInfoMap;
    }
}
