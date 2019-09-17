package com.cy.pj.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reqest/")
public class RequestHandleController {
	
	// 普通的url(多个url可以对应同一个资源)
	@RequestMapping(value = {"doHandleUrl", "doIndexUrl"})
	public String doHandleUrl() {
		return "index";
	}
	
	// Rest风格的url,其格式为{a}/{b}/{c}
	// 假如希望方法参数获取url中{}表达式内部的值
	// 可以使用@PathVariable对参数进行修饰
	@RequestMapping("{page}")
	public String doMoudleUI(@PathVariable String page) {
		return page;
	}
	
//	@RequestMapping(value = "type", method = RequestMethod.GET)
	@GetMapping("type")
	@ResponseBody
	public String doRequestType() {
		return "request type GET";
	}
	
}
