package com.chinasoft.service;
/**
 * 月票管理
 */

import com.chinasoft.domain.Car;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface MonthlyTicketService {

    /**
     * 查询所有月票信息
     * @return
     */
    List<Car> findAll(Integer page, Integer pageSize ,String carNum ,String ownerName);



}
