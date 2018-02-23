package com.edianedi.DesignPatterns.AdaterPatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jls on 2018/2/23.
 * 实现外包人员家庭信息类
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("address","中国北京海淀");
        homeInfoMap.put("homemobileNumber","010-1234567");
        System.out.println("外包人员家庭信息完成");
        return homeInfoMap;
    }
}
