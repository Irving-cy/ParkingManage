package com.chinasoft.service.impl;

import com.chinasoft.dao.DailyIncomeDao;
import com.chinasoft.domain.DailyIncome;
import com.chinasoft.domain.Record;
import com.chinasoft.service.DailyIncomeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("dailyIncomeService")
public class DailyIncomeServiceImpl implements DailyIncomeService{

    @Autowired
    private DailyIncomeDao dailyIncomeDao;

//    @Autowired
//    private RecordDao recordDao;

    @Override
    public List<DailyIncome> findAll(Integer page,Integer pageSize) {
        //表示开始分页
        PageHelper.startPage(page,pageSize);
        List<DailyIncome> all = dailyIncomeDao.findAll();
        for (DailyIncome dailyIncome : all) {
            //查询record表的fee的信息  或者调用RecordDao里面的方法获取fee的值
            Double todayIncome = dailyIncomeDao.findFeeByTime(dailyIncome.getTime());
            //查询并计算今天的月票收入
            Double vipIncome = dailyIncomeDao.findVIPCostByTime(dailyIncome.getTime());
            Double income = todayIncome + vipIncome;
            dailyIncome.setIncome(income);
        }
        return all;
    }

    @Override
    public List<Record> findByTime(Integer page, Integer pageSize, Date time) {
        //表示开始分页
        PageHelper.startPage(page,pageSize);
        return dailyIncomeDao.findByTime(time);
    }
}
