package com.chinasoft.dao;

import com.chinasoft.domain.DailyIncome;
import com.chinasoft.domain.Record;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface DailyIncomeDao {

    @Select("select * from daily_income group by time desc")
    List<DailyIncome> findAll();

    @Select("SELECT COUNT(id) from user WHERE createtime BETWEEN #{time} and (SELECT DATE_FORMAT(DATE_ADD(#{time},INTERVAL 1 DAY),'%Y-%m-%d'))")
    Double findVipCostByTime(String time);

    @Select("select vipCost from fee")
    Double findVipCost();

    @Select("select " +
            "(select name from user u where u.carNumber = r.carNumber) name," +
            "r.carNumber,r.inTime,r.outTime," +
            "(select roleName from role where id =(select role from user u where u.carNumber = r.carNumber)) type,r.fee " +
            "from record r " +
            "where SUBSTRING(outTime,1,10) = #{time}")
    List<Record> findDetailByTime(String time);

    @Update("update daily_income set income = #{income} where id = #{id}")
    void update(@Param("income") Double income,@Param("id") Integer id);


    @Select("select sum(f.fee) from (select fee from record where SUBSTRING(outTime,1,10) = #{time}) f")
    Double findFeeByTime(String time);

    @Select("select " +
            "(select name from user u where u.carNumber = r.carNumber) name," +
            "r.carNumber,r.inTime,r.outTime," +
            "(select roleName from role where id =(select role from user u where u.carNumber = r.carNumber)) type,r.fee " +
            "from record r " +
            "where SUBSTRING(outTime,1,10) between #{dTime} and #{fTime}")
    List<Record> findBySearch(@Param("dTime") String dTime,@Param("fTime") String fTime);
}
