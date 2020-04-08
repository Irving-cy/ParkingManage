package com.chinasoft.service.impl;


import com.chinasoft.dao.RukouDao;
import com.chinasoft.domain.Record;
import com.chinasoft.service.RukouService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rukouService")
public class RukouServiceImpl implements RukouService {

    @Autowired
    private RukouDao rukouDao;

    /**
     * 分页查询所有入库车辆信息
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Record> findAll(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return rukouDao.findAll();
    }

    /**
     * 添加入库车辆信息
     * @param record
     */
    @Override
    public void addRecord(Record record) {
        record.setCarNumber(record.getCarNumber());
        record.setInTime(record.getInTime());
        rukouDao.addRecord(record);
    }

}
