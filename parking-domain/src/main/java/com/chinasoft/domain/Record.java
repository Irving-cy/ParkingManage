package com.chinasoft.domain;

import com.chinasoft.utils.DateUtils;
import lombok.Data;

import java.util.Date;

@Data
public class Record {

    private Integer id;

    private String name;

    private String carNumber;

    private Date inTime;
    private String inTimeStr;

    private Date outTime;
    private String outTimeStr;

    private String type;

    private Double fee;

    public String getInTimeStr() {
        if (inTime == null) return "";
        return DateUtils.date2String(inTime,"yyyy-MM-dd hh:mm:ss");
    }

    public String getOutTimeStr() {
        if (outTime == null) return "";
        return DateUtils.date2String(outTime,"yyyy-MM-dd hh:mm:ss");
    }

}
