package com.chinasoft.controller;


import com.chinasoft.domain.Record;
import com.chinasoft.service.ChukouService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/chukou")
public class chukouController {

    @Autowired
    private ChukouService chukouService;

    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize
    ){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("chukou_list");
        List<Record> list = chukouService.findAll(page,pageSize);
        //生成分页消息
        PageInfo<Record> pageInfo = new PageInfo<>(list);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

    @RequestMapping("update")
    public String updateRecord(Record record){
        chukouService.updateRecord(record);
        return "chukou_update";
    }



}
