package com.chinasoft.dao;

import com.chinasoft.domain.Record;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

public interface ChukouDao {

    /**
     * 查询记录
     * @return
     */
    @Select("select * from record")
    List<Record> findAll();

//    /**
//     * 更新记录表
//     * @param record
//     */
//    @Update("update outTime set outTime=#{outTime},fee =#{fee}")
//    void updateRecord(Record record);

    @Select("select id from car where carNumber=#{carNumber}")
    Integer findIsVip(String carNumber);

    @Select("select vipRate from fee")
    Double findVipRate();

    @Select("select commonRate from fee")
    Double findCommonRate();

    @Select("select expireDate from car where carNumber=#{carNumber}")
    Date findExpireTime(String carNumber);

    @Update("update record set fee = #{fee} where carNumber = #{carNumber}")
    void saveFee(@Param("fee") double fee, @Param("carNumber") String carNumber);

    @Select("SELECT * from record WHERE carNumber LIKE #{search}")
    List<Record> search(String searchStr);
}
