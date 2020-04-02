package com.chinasoft.dao;

import com.chinasoft.domain.DailyIncome;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DailyIncomeDao {

    @Select("select * from daily_income")
    List<DailyIncome> findAll();
}
