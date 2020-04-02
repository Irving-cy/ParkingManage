package com.chinasoft.dao;

import org.apache.ibatis.annotations.Select;

public interface RoleDao {

    @Select("select roleName from role where id = #{roleId}")
    String findRoleNameById(Integer roleId);
}
