package com.chinasoft.service.impl;

import com.chinasoft.dao.MonthlyTicketDao;
import com.chinasoft.domain.Car;
import com.chinasoft.domain.UserInfo;
import com.chinasoft.service.MonthlyTicketService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service("monthlyTicketService")
public class MonthlyTicketServiceImpl implements MonthlyTicketService {

    @Autowired
    private MonthlyTicketDao dao;

    /**
     * 查询所有月票信息
     * @return
     */
    @Override
    public List<Car> findAll(Integer page, Integer pageSize ,String carNum ,String ownerName) {
        //        查询在USER表而不在CAR表且为月票用户的数据
        List<UserInfo> users = dao.findUserNotInCar();
//        如果月票用户存在于user表而不在car表,则将其插入到car表
        if (!users.isEmpty()){
            for (UserInfo user : users) {
                dao.save(user);
            }
        }
        PageHelper.startPage(page,pageSize);

//        如果前台页面传过来的值为空字符串，则给其赋值为null
        if (carNum==""){
            carNum = null;
        }
        if (ownerName==""){
            ownerName = null;
        }

        return dao.findAll(carNum, ownerName);
    }



}
