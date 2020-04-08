package com.chinasoft.dao;

import com.chinasoft.domain.Record;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RukouDao {

    /**
     * 查询入库车辆信息
     * @return
     */
    @Select("select * from record")
    List<Record> findAll();

    /**
     * 添加车辆入库记录
     * @param record
     */
    @Insert("insert into record(carNumber,inTime,outTime,fee) values(#{carNumber},#{inTime},#{outTime},#{fee})")
    void addRecord(Record record);


}
