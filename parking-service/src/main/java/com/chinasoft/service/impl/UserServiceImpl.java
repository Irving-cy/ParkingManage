package com.chinasoft.service.impl;

import com.chinasoft.dao.UserDao;
import com.chinasoft.domain.UserInfo;
import com.chinasoft.service.UserService;
import com.chinasoft.utils.PasswordUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 分页查询所有用户信息
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<UserInfo> findAll(Integer page, Integer pageSize) {
        //开始分页
        PageHelper.startPage(page,pageSize);
        return userDao.findAll();
    }

    /**
     * 保存增加用户
     * @param userInfo
     */
    @Override
    public void saveUser(UserInfo userInfo) {
        userInfo.setPassword(PasswordUtils.setBCryptPasswordEncoder(userInfo.getPassword()));
        userDao.saveUser(userInfo);
    }

    /**
     * 根据id删除用户
     * @param id
     */
    @Override
    public void delete(Integer id) {
      userDao.delete(id);
        System.out.println(id);
    }

    /**
     * 根据id查找需要修改的信息
     * @param id
     * @return
     */
    @Override
    public UserInfo change(Integer id) {
        return userDao.change(id);
    }

    /**
     * 保存修改用户信息
     * @param userInfo
     */
    @Override
    public void savechange(UserInfo userInfo) {
      userDao.savechange(userInfo);
    }

    /**
     * 模糊查用户信息
     * @param page
     * @param pageSize
     * @param search
     * @return
     */
    @Override
    public List<UserInfo> search(Integer page, Integer pageSize, String search) {
        PageHelper.startPage(page,pageSize);
        String searchstr = "%"+search+"%";
        return userDao.search(searchstr);
    }


}
