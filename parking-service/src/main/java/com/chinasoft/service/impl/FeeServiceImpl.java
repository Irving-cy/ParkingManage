package com.chinasoft.service.impl;

import com.chinasoft.dao.FeeDao;
import com.chinasoft.domain.Fee;
import com.chinasoft.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 费率管理
 */
@Service("feeService")
public class FeeServiceImpl implements FeeService {

    @Autowired
    private FeeDao feeDao;

    /**
     * 查询费率
     * @return
     */
    @Override
    public List<Fee> findAll() {
        return feeDao.findAll();
    }

    /**
     * 通过id查询费率表
     * @param id
     * @return
     */
    @Override
    public Fee findFeeById(Integer id) {
        return feeDao.findFeeById(id);
    }

    /**
     * 更新费率表
     * @param fee
     */
    @Override
    public void updateFee(Fee fee) {
        feeDao.updateFee(fee);
    }
}
