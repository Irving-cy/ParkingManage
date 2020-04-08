package com.chinasoft.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Record {

    private Integer id;

    private String carNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date inTime;
    private String inTimeStr;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date outTime;
    private String outTimeStr;

    private Double fee;

    private String type;
    private String name;

}
