package com.chinasoft.service.impl;

import com.chinasoft.dao.ChukouDao;
import com.chinasoft.domain.Record;
import com.chinasoft.service.ChukouService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service("chukouService")
public class ChukouServiceImpl implements ChukouService {

    @Autowired
    private ChukouDao chukouDao;

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Record> findAll(Integer page, Integer pageSize) {

        PageHelper.startPage(page,pageSize);
        List<Record> lists = chukouDao.findAll();
        for (Record list : lists) {
            try {
                //获取得到的时间转成毫秒
                Calendar calendar1 = Calendar.getInstance();
                calendar1.setTime(list.getInTime());
                long timeInMillis1 = calendar1.getTimeInMillis();

                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(list.getOutTime());
                long timeInMillis2 = calendar1.getTimeInMillis();


                long totalTime = timeInMillis2 - timeInMillis1;
                System.out.println(totalTime);

                long totalHour = (totalTime % (1000 * 3600)) + 1;
                System.out.println(totalHour);

                Integer isVip = chukouDao.findIsVip(list.getCarNumber());
                System.out.println(isVip);

                Double vipRate = chukouDao.findVipRate();
                Double commonRate = chukouDao.findCommonRate();

                if (isVip > 0){
                    list.setFee(totalHour * vipRate);
                }
                if (isVip == null){
                    list.setFee(totalHour * commonRate);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lists;
    }

    /**
     * 更新记录表信息
     * @param record
     */
    @Override
    public void updateRecord(Record record) {
        record.setOutTime(record.getOutTime());
        record.setFee(record.getFee());
        chukouDao.updateRecord(record);
    }

    /**
     * 计算费用
     */
    @Override
    public void getFee() {


    }


}
