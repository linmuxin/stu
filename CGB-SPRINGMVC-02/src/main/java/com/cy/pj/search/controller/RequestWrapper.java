package com.cy.pj.search.controller;

/**
 * 请求封装类
 * @author UID
 *
 */
public class RequestWrapper {
	
	
	private Integer name;
	private String value;
	public Integer getName() {
		return name;
	}
	public void setName(Integer name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "RequestWrapper [name=" + name + ", value=" + value + "]";
	}
	
}
