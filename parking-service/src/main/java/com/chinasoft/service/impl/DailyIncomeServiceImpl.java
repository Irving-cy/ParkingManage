package com.chinasoft.service.impl;

import com.chinasoft.dao.DailyIncomeDao;
import com.chinasoft.domain.DailyIncome;
import com.chinasoft.service.DailyIncomeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dailyIncomeService")
public class DailyIncomeServiceImpl implements DailyIncomeService{

    @Autowired
    private DailyIncomeDao dailyIncomeDao;

    @Override
    public List<DailyIncome> findAll(Integer page, Integer pageSize) {
        //表示开始分页
        PageHelper.startPage(page,pageSize);
        System.out.println("2");
        return dailyIncomeDao.findAll();
    }

    @Override
    public DailyIncome findByTime() {
        return dailyIncomeDao.findByTime();
    }
}
