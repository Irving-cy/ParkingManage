package com.chinasoft.service;

import com.chinasoft.domain.DailyIncome;

import java.util.List;

public interface DailyIncomeService {

    List<DailyIncome> findAll(Integer page, Integer pageSize);
}
