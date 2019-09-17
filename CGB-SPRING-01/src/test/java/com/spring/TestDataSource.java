package com.spring;

import javax.sql.DataSource;

import org.junit.Test;



public class TestDataSource extends TestBean {
	
	@Test
	public void testDruidDataSource() throws Exception {
		DataSource ds = ctx.getBean("druid", DataSource.class);
//		Assert.assertNotEquals(null, ds);
		System.out.println(ds.getConnection());
	}
	
	@Test
	public void testHiKariDataSource() throws Exception {
		DataSource ds = ctx.getBean("hikari", DataSource.class);
//		Assert.assertNotEquals("hikari", ds);
		System.out.println(ds.getConnection());
	}
}
