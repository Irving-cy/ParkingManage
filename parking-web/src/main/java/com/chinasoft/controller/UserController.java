package com.chinasoft.controller;

import com.chinasoft.domain.UserInfo;
import com.chinasoft.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 分页查询所有用户信息
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize
    ){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user-list");
        //生成分页消息
        List<UserInfo> lists=userService.findAll(page,pageSize);
        PageInfo<UserInfo> pageInfo=new PageInfo<>(lists);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

     //增加部分
    /**
     * 增加
     * @return
     */
    @RequestMapping("add")
    public String addUser(){
       return "user-add";
    }

    /**
     * 保存并重定向
     * @param userInfo
     * @return
     */
    @RequestMapping("save")
    public String saveUser(UserInfo userInfo){
        userService.saveUser(userInfo);
        return "redirect:/user/findAll";
    }

    /**
     * 通过id删除并重定向
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(@RequestParam("id") Integer id){
        userService.delete(id);
        return "redirect:/user/findAll";
    }

    //修改信息
    /**
     * 获取修改id信息
     * @return
     */
    @RequestMapping("change")
    public ModelAndView change(@RequestParam("id") Integer id){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user-change");
        mv.addObject("user",userService.change(id));
        return mv;
    }

    /**
     * 保存修改信息,并重定向
     * @return
     */
    @RequestMapping("savechange")
    public String savechange(UserInfo userInfo){
        userService.savechange(userInfo);
        return "redirect:/user/findAll";
    }

    /**
     * 根据用户名模糊查询,并分页显示
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "search")
    public ModelAndView search(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                              @RequestParam(value = "search") String search
    ){
        ModelAndView mv=new ModelAndView();
        //String searchstr = "%"+search+"%";
        mv.addObject("search",search);
        mv.setViewName("user-search");
        //生成分页消息
        List<UserInfo> lists=userService.search(page,pageSize,search);
        System.out.println(search);
        PageInfo<UserInfo> pageInfo=new PageInfo<>(lists);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

}
