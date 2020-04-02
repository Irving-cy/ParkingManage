package com.chinasoft.controller;

import com.chinasoft.domain.Fee;
import com.chinasoft.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 费率管理
 */
@Controller
@RequestMapping("fee")
public class FeeController {

    @Autowired
    private FeeService feeService;

    /**
     * 查询费率
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("fee-list");
        mv.addObject("feeList",feeService.findAll());
        return mv;
    }

    /**
     * 通过id查询费率表
     * @param id
     * @return
     */
    @RequestMapping("findFeeById")
    public ModelAndView findFeeById(@RequestParam("id") Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("fee-update");
        mv.addObject("feeUpdate",feeService.findFeeById(id));
        return mv;
    }

    /**
     * 更新费率表
     * @param fee
     * @return
     */
    @RequestMapping("update")
    public String update(Fee fee){
        feeService.updateFee(fee);
        return "redirect:/fee/findAll";
    }

}
