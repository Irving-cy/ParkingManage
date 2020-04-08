package com.chinasoft.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Record {

    private Integer id;

    private String carNumber;

    private Date inTime;

    private Date outTime;

    private Double fee;

}
