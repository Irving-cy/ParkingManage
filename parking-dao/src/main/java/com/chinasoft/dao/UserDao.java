package com.chinasoft.dao;

import com.chinasoft.domain.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from user")
    List<UserInfo> findAll();

    /**
     * 增加,保存用户
     * @param userInfo
     */
    @Insert("insert into user(name,createtime,password,role,carNumber) values(#{name},#{createtime},#{password},#{role},#{carNumber})")
    void saveUser(UserInfo userInfo);


    /**
     * 通过id删除用户
     * @param id
     */
    @Delete("delete from user where id=#{id}")
    void delete(Integer id);

    @Select("select * from user where id=#{id}")
    UserInfo change(Integer id);

    /**
     * 保存修改的用户信息
     * @param userInfo
     */
    @Update("update user set name=#{name},createtime=#{createtime},role=#{role},carNumber=#{carNumber} WHERE id=#{id}")
    void savechange(UserInfo userInfo);

    /**
     * 根据用户名模糊查询用户信息,并分页显示

     * @param search
     * @return
     */
    @Select("SELECT * from user WHERE name LIKE #{search}")
    List<UserInfo> search(String search);


    //--? zlx ?--//
    @Select("select f.vipCost*a.num cost from fee f,(select role,COUNT(role) num from user where SUBSTRING(createTime,1,10) = #{time} group by role) a where f.id = a.role")
    Double findVIPCost(Date time);
}
