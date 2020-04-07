package com.chinasoft.service;

import com.chinasoft.domain.UserInfo;
import org.springframework.ui.ModelMap;

import java.util.List;

public interface UserService {

    List<UserInfo> findAll(Integer page, Integer pageSize);

    void saveUser(UserInfo userInfo);

    void delete(Integer id);

    UserInfo change(Integer id);

    void savechange(UserInfo userInfo);

    List<UserInfo> search(Integer page, Integer pageSize, String name);

}
