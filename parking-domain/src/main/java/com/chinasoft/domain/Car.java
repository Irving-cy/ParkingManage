package com.chinasoft.domain;

import com.chinasoft.utils.DateUtils;
import lombok.Data;

import java.util.Date;


@Data
public class Car {

//    主键
    private int id;
//    车牌号
    private String carNumber;
//    车主姓名
    private String carOwnerName;
//    vip到期日期
    private Date expireDate;
    private String expireDateStr;

    public String getExpireDateStr() {
        return expireDateStr = expireDate == null ? "" : DateUtils.date2String(expireDate,"yyyy-MM-dd");
    }
}
