package com.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class C01Controller {

    @RequestMapping("/say")
    public ModelAndView say() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "springboot大爷你好！");
        mav.setViewName("c01hello");
        return mav;
    }
}
