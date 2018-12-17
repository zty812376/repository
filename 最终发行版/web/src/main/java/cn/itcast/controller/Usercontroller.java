package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private Userservice userservice;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<User> all = userservice.findAll();
        System.out.println(all);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("all",all);
        modelAndView.setViewName("ok");
        return modelAndView;
    }
}
