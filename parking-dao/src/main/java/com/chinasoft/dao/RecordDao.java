package com.chinasoft.dao;

import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface RecordDao {

    @Select("SELECT SUM(f.fee) FROM (SELECT fee FROM record WHERE outTime BETWEEN #{time} and (SELECT DATE_FORMAT(DATE_ADD(#{time},INTERVAL 1 DAY),'%Y-%m-%d'))) f")
    Double findFeeByTime(String time);

}
