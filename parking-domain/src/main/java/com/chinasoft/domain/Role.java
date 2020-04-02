package com.chinasoft.domain;


import lombok.Data;

@Data
public class Role {
    private Integer id;
    //    角色名称
    private String roleName;
    //   角色描述
    private String roleDesc;

    //    一个角色对应多个用户名
//    private List<UserInfo> users;

    //    一个角色对应多个资源
//    private List<Permission> permissions;
}
