package com.chinasoft.domain;

import lombok.Data;

/**
 * 费率实体类
 */
@Data
public class Fee {

    // 主键
    private Integer id;

    // 月票用户费率
    private Double vipRate;

    // 普通用户费率
    private Double commonRate;

    // 月票费用
    private Double vipCost;

}
