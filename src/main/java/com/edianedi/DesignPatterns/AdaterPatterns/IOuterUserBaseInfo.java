package com.edianedi.DesignPatterns.AdaterPatterns;

import java.util.Map;

/**
 * Created by jls on 2018/2/23.
 * 外包人员进本信息接口
 */
public interface IOuterUserBaseInfo {
    //基本信息包括 姓名 性别 手机号码等
    public Map getUserBaseInfo();

}
