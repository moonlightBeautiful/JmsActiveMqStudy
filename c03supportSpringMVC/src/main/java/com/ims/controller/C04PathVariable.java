package com.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class C04PathVariable {

    @RequestMapping("/query/{id}")
    public ModelAndView show(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("id", id);
        mav.setViewName("c04blog");
        return mav;
    }
}
