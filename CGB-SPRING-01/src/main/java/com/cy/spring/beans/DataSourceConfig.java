package com.cy.spring.beans;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean(value = "druid", initMethod = "init", destroyMethod = "close")
	public DataSource newDruid() {
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl("jdbc:mysql:///dbgoods?serverTimezone=GMT");
		ds.setUsername("root");
		ds.setPassword("tarena");
		return ds;
	}
	
	@Bean(value = "hikari", destroyMethod = "close")
	public DataSource newHiKariCP() {
		HikariDataSource hk = new HikariDataSource();
		hk.setJdbcUrl("jdbc:mysql:///dbgoods?serverTimezone=GMT");
		hk.setUsername("root");
		hk.setPassword("tarena");
		
		return hk;
	}
}
