package com.chinasoft.controller;


import com.chinasoft.domain.DailyIncome;
import com.chinasoft.service.DailyIncomeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("dailyIncome")
public class DailyIncomeController {

    @Autowired
    private DailyIncomeService dailyIncomeService;

    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(name = "page",defaultValue = "1") Integer page,
                                @RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize){
        List<DailyIncome> lists = dailyIncomeService.findAll(page,pageSize);
        for (DailyIncome list : lists) {
            System.out.println(list);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dailyIncome");
        //生成分页信息
        PageInfo<DailyIncome> pageInfo = new PageInfo<>(lists);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

}
