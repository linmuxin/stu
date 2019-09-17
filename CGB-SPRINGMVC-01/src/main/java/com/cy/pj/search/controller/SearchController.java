package com.cy.pj.search.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/search/")
public class SearchController {
	
	@RequestMapping("doSearchUI")
	public String doSearchUI() {
		return "search";
	}
	
	@RequestMapping("doSearch")
	@ResponseBody
	public Object doSearch(String key) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("state", 1);
		map.put("message", "hello everyone");
		return map;
	}
}
