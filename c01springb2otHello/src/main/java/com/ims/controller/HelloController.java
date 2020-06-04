package com.ims.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gx
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String say(){
		return "spring boot 你大爷";
	}
}
