package com.cy.pj.common.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 此类负责数据层配置
 * @author UID
 */
@Configuration
@MapperScan("com.cy.pj.goods.dao")
public class SpringRepositoryConfig {
	
	/**
	 * 整合连接池对象
	 * @return
	 */
	@Bean(value = "druid", initMethod = "init", destroyMethod = "close")
	public DruidDataSource dataSource() {
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl("jdbc:mysql:///dbgoods?serverTimezone=GMT");
		ds.setUsername("root");
		ds.setPassword("tarena");
		return ds;
	}
	
	/**
	 * 整合Mybatis框架
	 * @throws Exception
	 */
	@Bean("sqlSessionFactory")
	public SqlSessionFactory newSqlSessionFactory(DataSource dataSource) throws Exception {
		// 构建SqlSessionFactoryBean对象
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		// 调用FactoryBean的getObject方法创建SqlSessionFactory
		// 底层会使用SqlSessionFactoryBuilder创建
		return factoryBean.getObject();
	}
}
