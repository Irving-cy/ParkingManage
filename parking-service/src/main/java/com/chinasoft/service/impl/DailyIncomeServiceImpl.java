package com.chinasoft.service.impl;

import com.chinasoft.dao.DailyIncomeDao;
import com.chinasoft.dao.RecordDao;
import com.chinasoft.dao.UserDao;
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

    @Autowired
    private RecordDao recordDao;

    @Autowired
    private UserDao userDao;

    @Override
    public List<DailyIncome> findAll(Integer page,Integer pageSize) {
        //表示开始分页
        PageHelper.startPage(page,pageSize);
        List<DailyIncome> lists= dailyIncomeDao.findAll();
        for (DailyIncome dailyIncome : lists) {
            System.out.println(dailyIncome);
            String time = dailyIncome.getTimeStr();
            //查询record表的fee的信息  或者调用RecordDao里面的方法获取fee的值
            Double todayIncome = recordDao.findFeeByTime(time);
            //查询并计算今天的月票收入

//            Double vipIncome = userDao.findVIPCost(time);
//            Double income = todayIncome + vipIncome;

            dailyIncome.setIncome(todayIncome);
        }
        return lists;
    }

//    @Override
//    public List<Record> findDetailByTime(Integer page, Integer pageSize, Date time) {
//        //表示开始分页
//        PageHelper.startPage(page,pageSize);
//        return dailyIncomeDao.findDetailByTime(time);
//    }
}
