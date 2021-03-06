package com.chinasoft.service.impl;

import com.chinasoft.dao.DailyIncomeDao;
import com.chinasoft.domain.DailyIncome;
import com.chinasoft.domain.Record;
import com.chinasoft.service.DailyIncomeService;
import com.chinasoft.utils.DateUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("dailyIncomeService")
public class DailyIncomeServiceImpl implements DailyIncomeService{

    @Autowired
    private DailyIncomeDao dailyIncomeDao;


    @Override
    public List<DailyIncome> findAll(Integer page,Integer pageSize) {
        //表示开始分页
        PageHelper.startPage(page,pageSize);
        List<DailyIncome> lists= dailyIncomeDao.findAll();

        for (DailyIncome dailyIncome : lists) {
            String time = dailyIncome.getTimeStr();
            //查询record表的fee的信息  或者调用RecordDao里面的方法获取fee的值
            Double todayIncome;
            if(dailyIncomeDao.findFeeByTime(time) == null){
                todayIncome = 0.0;
            }else {
                todayIncome = dailyIncomeDao.findFeeByTime(time);
            }
//            Double todayIncome = dailyIncomeDao.findFeeByTime(time);
            //查询并计算今天的月票收入
            Double vipIncome = dailyIncomeDao.findVipCostByTime(time) * dailyIncomeDao.findVipCost();
            //将算得的数据更新到数据库
            dailyIncomeDao.update((todayIncome + vipIncome),dailyIncome.getId());
            dailyIncome.setIncome(todayIncome + vipIncome);
        }
        return lists;
    }

    @Override
    public List<Record> findDetailByTime(Integer page, Integer pageSize, Date time) {
        //表示开始分页
        PageHelper.startPage(page,pageSize);
        System.out.println(time);
        String timeStr = DateUtils.date2String(time, "yyyy-MM-dd");
        List<Record> detail = dailyIncomeDao.findDetailByTime(timeStr);
        for (Record rec : detail) {
            rec.setInTimeStr(DateUtils.date2String(rec.getInTime(),"yyyy-MM-dd HH:mm"));
            rec.setOutTimeStr(DateUtils.date2String(rec.getOutTime(),"yyyy-MM-dd HH:mm"));
        }
        return detail;
    }

    @Override
    public List<Record> search(Integer page, Integer pageSize, String search) {
        //表示开始分页
        PageHelper.startPage(page,pageSize);

        Calendar c = Calendar.getInstance();
        String dTime = DateUtils.date2String(c.getTime(),"yyyy-MM-dd");
        switch (search){
            case "week":
                c.add(Calendar.DAY_OF_WEEK,-7);
                break;
            case "month":
                c.add(Calendar.MONTH,-1);
                break;
            case "quarter":
                c.add(Calendar.MONTH,-3);
                break;
        }
        String fTime = DateUtils.date2String(c.getTime(),"yyyy-MM-dd");
        List<Record> too = dailyIncomeDao.findBySearch(fTime,dTime);

        return too;
    }

}
