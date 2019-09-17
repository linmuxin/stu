package com.cy.pj.search.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/resp/")
public class ResponseHandleController {
	
	@RequestMapping("doResponseUI")
	public String doResponseUI() {
		return "response";
	}
	
	@RequestMapping("type")
	public String doResponseType() {
		// 重定向
//		return "redirect:doResponseUI";
		// 转发
		return "forward:doResponseUI";
	}
	
	@RequestMapping("doDataConvert")
	@ResponseBody
	public String doDataConvert() throws IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 100);
		map.put("msg", "hello jackson");
		ObjectMapper om = new ObjectMapper();
		
		return om.writeValueAsString(map);
	}
}
