package com.chinasoft.controller;


import cn.hutool.core.date.DateUnit;
import com.chinasoft.domain.DailyIncome;
import com.chinasoft.domain.Record;
import com.chinasoft.service.DailyIncomeService;
import com.chinasoft.utils.DateUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("dailyIncome")
public class DailyIncomeController {

    @Autowired
    private DailyIncomeService dailyIncomeService;


    //查询日结算
    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(name = "page",defaultValue = "1") Integer page,
                                @RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize){
        ModelAndView mv = new ModelAndView();
        List<DailyIncome> lists = dailyIncomeService.findAll(page,pageSize);
        mv.setViewName("dailyIncome");
        //生成分页信息
        PageInfo<DailyIncome> pageInfo = new PageInfo<>(lists);
        mv.addObject("dailyIncome",pageInfo);
        return mv;

    }
    
    //显示结算的详细
    @RequestMapping("findByTime")
    public ModelAndView findByTime(@RequestParam(name = "page",defaultValue = "1") Integer page,
                                   @RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize,
                                    @RequestParam("time") Date time){
        List<Record> lists = dailyIncomeService.findByTime(page,pageSize,time);
        for (Record list : lists) {
            System.out.println(list);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dailyIncomeDetail");
        //生成分页信息
        PageInfo<Record> pageInfo = new PageInfo<>(lists);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

}
