package com.chinasoft.dao;
/**
 * 月票管理
 */

import com.chinasoft.domain.Car;
import com.chinasoft.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MonthlyTicketDao {

    /**
     * 查询所有月票信息
     * @return
     */
    @Select("<script>select * from car <where>" +
            "<if test='carNum != null'>carNumber like CONCAT(CONCAT('%',#{carNum}),'%')</if>" +
            "<if test='ownerName != null'> and carOwnerName like CONCAT(CONCAT('%',#{ownerName}),'%')</if>" +
            "</where></script>")
    List<Car> findAll(@Param("carNum") String carNum ,@Param("ownerName") String ownerName);



    /**
     * 查询在USER表而不在CAR表且为月票用户的数据
     * @return
     */
    @Results(id = "userMap",value = {
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "createtime",column = "createtime"),
            @Result(property = "password",column = "password"),
            @Result(property = "role",column = "role"),
            @Result(property = "carNumber",column = "carNumber"),
    })
    @Select("select id,name,DATE_ADD(createtime,INTERVAL 1 month) createtime,password,role,carNumber from user where role = 0 and carNumber not in (select distinct carNumber from car)")
    List<UserInfo> findUserNotInCar();

    /**
     * 将不存在于car表的月票用信息插入car表
     * @param user
     */
    @Insert("insert into car(carNumber,carOwnerName,expireDate) values(#{carNumber},#{name},#{createtime})")
    void save(UserInfo user);
}
