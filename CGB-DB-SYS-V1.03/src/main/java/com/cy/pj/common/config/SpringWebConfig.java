package com.cy.pj.common.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.web.filter.DelegatingFilterProxy;

//@Configuration
public class SpringWebConfig {
    /**
          *  注册过滤器对象DelegatingFilterProxy,
          *  此对象由Spring框架提供，核心作用就是
          *  通过它基于web请求加载指定的Bean对象。      
     * @return
     */
	//@Bean
	public FilterRegistrationBean<DelegatingFilterProxy>  filterRegistrationBean() {
		FilterRegistrationBean<DelegatingFilterProxy> rBean=
		new FilterRegistrationBean<>();
		rBean.setFilter(new DelegatingFilterProxy("shiroFilterFactory"));
		rBean.addUrlPatterns("/*");
		return rBean;
	} 
}






