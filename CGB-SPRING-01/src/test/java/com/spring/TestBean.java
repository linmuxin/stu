package com.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cy.spring.config.SpringConfig;

public class TestBean {
	protected AnnotationConfigApplicationContext ctx;
	
	@Before
	public void init() {
		ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
	}
	
	@Test
	public void testCxt() {
		System.out.println(ctx);
	}
	
	@After
	public void close() {
		ctx.close();
	}
}
