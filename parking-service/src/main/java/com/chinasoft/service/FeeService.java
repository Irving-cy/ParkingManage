package com.chinasoft.service;

import com.chinasoft.domain.Fee;

import java.util.List;

public interface FeeService {

    List<Fee> findAll();

    Fee findFeeById(Integer id);

    void updateFee(Fee fee);
}
