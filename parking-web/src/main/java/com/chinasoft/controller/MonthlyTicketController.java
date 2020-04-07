package com.chinasoft.controller;

import com.chinasoft.domain.Car;
import com.chinasoft.service.MonthlyTicketService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 月票管理controller
 */


@Controller
@RequestMapping("monthlyTicket")
public class MonthlyTicketController {

    @Autowired
    private MonthlyTicketService service;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                HttpServletRequest request){

        String carNum = request.getParameter("carNum");
        String ownerName = request.getParameter("ownerName");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("car-list");
        List<Car> list = service.findAll(page, pageSize ,carNum ,ownerName);
        PageInfo<Car> pageInfo = new PageInfo<>(list);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }


}
