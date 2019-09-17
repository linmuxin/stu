package com.spring;

import org.junit.Test;

import com.cy.spring.beans.DefaultCache;


public class TestDefaultCache  extends TestBean {
	
	@Test
	public void testDefaultCache() {
		DefaultCache cache = ctx.getBean(DefaultCache.class);
		System.out.println(cache);
	}
	
}
