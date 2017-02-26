package com.pumpkin.aloaded.controller.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloController {

	@RequestMapping(value="/hello")
	public String helloWorld(){
		return "manager/test/hello";
	}
}
