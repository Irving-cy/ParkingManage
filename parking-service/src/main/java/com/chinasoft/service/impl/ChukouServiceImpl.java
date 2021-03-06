package com.chinasoft.service.impl;

import com.chinasoft.dao.ChukouDao;
import com.chinasoft.domain.Record;
import com.chinasoft.domain.UserInfo;
import com.chinasoft.service.ChukouService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
                long timeInMillis2 = calendar2.getTimeInMillis();

                long totalTime = timeInMillis2 - timeInMillis1;
                System.out.println(totalTime);

                long totalHour = totalTime / (1000 * 3600);
                System.out.println(totalHour);

                Integer isVip = chukouDao.findIsVip(list.getCarNumber());
                System.out.println(isVip);

                Double vipRate = chukouDao.findVipRate();
                Double commonRate = chukouDao.findCommonRate();

                if(isVip == null){
                    list.setFee(totalHour * commonRate);
                    chukouDao.saveFee(totalHour * commonRate, list.getCarNumber());
                }else {
                    Date expireTime = chukouDao.findExpireTime(list.getCarNumber());
                    if(expireTime.before(list.getOutTime())){
                        list.setFee(totalHour * commonRate);
                        chukouDao.saveFee(totalHour * commonRate, list.getCarNumber());
                    }else {
                        list.setFee(totalHour * vipRate);
                        chukouDao.saveFee(totalHour * vipRate, list.getCarNumber());
                    }
                }

//                if (isVip > 0){
//                    Date expireTime = chukouDao.findExpireTime(list.getCarNumber());
//                    if(expireTime.after(list.getOutTime())){
//                        list.setFee(totalHour * vipRate);
//                        if(list.getFee() == null){
//                            chukouDao.saveFee(totalHour * vipRate, list.getCarNumber());
//                        }
//                    }else {
//                        list.setFee(totalHour * commonRate);
//                        if(list.getFee() == null){
//                            chukouDao.saveFee(totalHour * commonRate, list.getCarNumber());
//                        }
//                    }
//                } else {
//                    list.setFee(totalHour * commonRate);
//                    if(list.getFee() == null){
//                        chukouDao.saveFee(totalHour * commonRate, list.getCarNumber());
//                    }
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lists;
    }

    @Override
    public List<Record> search(Integer page, Integer pageSize, String search) {
        PageHelper.startPage(page,pageSize);
        String searchStr = "%"+search+"%";
        return chukouDao.search(searchStr);
    }

//    /**
//     * 更新记录表信息
//     * @param record
//     */
//    @Override
//    public void updateRecord(Record record) {
//        record.setOutTime(record.getOutTime());
//        record.setFee(record.getFee());
//        chukouDao.updateRecord(record);
//    }
//
//    /**
//     * 计算费用
//     */
//    @Override
//    public void getFee() {
//
//
//    }


}
