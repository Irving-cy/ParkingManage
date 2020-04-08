package com.chinasoft.dao;

import com.chinasoft.domain.DailyIncome;
import com.chinasoft.domain.Record;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface DailyIncomeDao {

    @Select("select * from daily_income group by time desc")
    List<DailyIncome> findAll();

    @Select("select " +
            "u.name,r.carNumber,r.outTime,r.inTime,r.type,r.fee " +
            "from record r " +
            "left join user u on r.user_id = u.id " +
            "where SUBSTRING(outTime,1,10) = #{time}")
    @Results(id = "recordMap",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "carNumber",property = "carNumber"),
            @Result(column = "outTime",property = "outTime"),
    })
    List<Record> findDetailByTime(Date time);

}
