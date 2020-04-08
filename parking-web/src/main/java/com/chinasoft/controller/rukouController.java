package com.chinasoft.controller;


import com.chinasoft.domain.Record;
import com.chinasoft.service.RukouService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/rukou")
public class rukouController {

    @Autowired
    private RukouService rukouService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize
    ){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("rukou_list");
        List<Record> list = rukouService.findAll(page,pageSize);
        //生成分页消息
        PageInfo<Record> pageInfo = new PageInfo<>(list);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

    @RequestMapping("add")
    public String addRecord(Record record){
        rukouService.addRecord(record);
        return "rukou_update";
    }

}
