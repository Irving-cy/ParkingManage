package com.chinasoft.domain;

import com.chinasoft.utils.DateUtils;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class DailyIncome {
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date time;
    private String timeStr;

    private Double income;

    public String getTimeStr() {
        if (time == null) return "";
        return DateUtils.date2String(time,"yyyy-MM-dd hh:mm:ss");
    }
}
