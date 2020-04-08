package com.chinasoft.service.impl;

import com.chinasoft.dao.ChukouDao;
import com.chinasoft.domain.Record;
import com.chinasoft.service.ChukouService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return chukouDao.findAll();
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
