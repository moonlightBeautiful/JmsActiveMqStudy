package com.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class C03RequestParam {
	
	@RequestMapping("/query")
	public ModelAndView query(@RequestParam(value="q",required=false)String q){
		ModelAndView mav=new ModelAndView();
		mav.addObject("q", q);
		mav.setViewName("c03query");
		return mav;
	}
}
