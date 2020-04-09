package com.chinasoft.service;

import com.chinasoft.domain.Record;

import java.util.List;

public interface RukouService {

    List<Record> findAll(Integer page, Integer pageSize);

    void addRecord(Record record);


    List<Record> search(Integer page, Integer pageSize, String search);
}
