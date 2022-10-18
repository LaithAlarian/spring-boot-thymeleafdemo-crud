package com.crud.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crud.springboot.thymeleafdemo.entity.Employee;

@Controller
public class DemoController {
	
	//create a mapping for "/hello"
	
	@GetMapping("/hello")
	public String sayHello(Model model)
	{
		model.addAttribute("theDate", new java.util.Date());
		return "helloworld";
	}
	

	

}
