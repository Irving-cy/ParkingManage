package com.chinasoft.dao;

import com.chinasoft.domain.Fee;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 费率管理
 */
public interface FeeDao {

    /**
     * 查询费率
     * @return
     */
    @Select("select * from fee")
    List<Fee> findAll();

    /**
     * 通过id查询费率表
     * @param id
     * @return
     */
    @Select("select * from fee where id=#{id}")
    Fee findFeeById(Integer id);

    /**
     * 更新费率表
     * @param fee
     */
    @Update("update fee set vipRate = #{vipRate}, commonRate = #{commonRate}, vipCost = #{vipCost}")
    void updateFee(Fee fee);
}
