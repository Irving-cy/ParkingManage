package com.chinasoft.dao;

import com.chinasoft.domain.Record;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ChukouDao {

    /**
     * 查询记录
     * @return
     */
    @Select("select * from record")
    List<Record> findAll();

    /**
     * 更新记录表
     * @param record
     */
    @Update("update outTime set outTime=#{outTime},fee =#{fee}")
    void updateRecord(Record record);


}
