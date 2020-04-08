package com.chinasoft.controller;


import com.chinasoft.domain.DailyIncome;
import com.chinasoft.domain.Record;
import com.chinasoft.service.DailyIncomeService;
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
        mv.addObject("pageInfo",pageInfo);
        return mv;

    }
    
    //显示结算的详细
    @RequestMapping("findDetailByTime")
    public ModelAndView findDetailByTime(@RequestParam(name = "page",defaultValue = "1") Integer page,
                                   @RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize,
                                    @RequestParam("time") Date time){
        ModelAndView mv = new ModelAndView();
        List<Record> lists = dailyIncomeService.findDetailByTime(page,pageSize,time);
        mv.addObject("time",time);
        mv.setViewName("dailyIncomeDetail");
        //生成分页信息
        PageInfo<Record> pageInfo = new PageInfo<>(lists);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

    //模糊查询
    @RequestMapping("search")
    public ModelAndView search(@RequestParam(value = "page",defaultValue = "1") Integer page,
                               @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                               @RequestParam(value = "search") String search){
        ModelAndView mv=new ModelAndView();
        List<Record> lists = dailyIncomeService.search(page,pageSize,search);
        mv.addObject("search",search);
        mv.addObject("time",System.currentTimeMillis());
        mv.setViewName("dailyIncomeDetail");
        //生成分页消息
        PageInfo<Record> pageInfo=new PageInfo<>(lists);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

}
