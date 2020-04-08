package com.chinasoft.service;

import com.chinasoft.domain.DailyIncome;
import com.chinasoft.domain.Record;

import java.util.Date;
import java.util.List;

public interface DailyIncomeService {

    List<DailyIncome> findAll(Integer page,Integer pageSize);

    List<Record> findDetailByTime(Integer page, Integer pageSize, Date time);
}
