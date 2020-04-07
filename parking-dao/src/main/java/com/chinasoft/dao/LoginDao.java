package com.chinasoft.dao;

import com.chinasoft.domain.UserInfo;
import org.apache.ibatis.annotations.Select;


public interface LoginDao {

    @Select("select * from user where name = #{username}")
    UserInfo findUserByName(String username);
}
