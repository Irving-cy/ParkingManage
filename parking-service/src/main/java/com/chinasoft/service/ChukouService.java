package com.chinasoft.service;

import com.chinasoft.domain.Record;

import java.util.List;

public interface ChukouService {

    List<Record> findAll(Integer page, Integer pageSize);

    List<Record> search(Integer page, Integer pageSize, String search);

//    void updateRecord(Record record);
//
//    void getFee();


}
