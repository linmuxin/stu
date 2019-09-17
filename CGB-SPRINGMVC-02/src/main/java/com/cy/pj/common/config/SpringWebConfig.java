package com.cy.pj.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 配置配置Bean对象的扫描
@ComponentScan("com.cy.pj")
// 注册默认的一些mvc bean对象
@EnableWebMvc
public class SpringWebConfig implements WebMvcConfigurer {
	//配置静态资源的处理
	//等价于<mvc:default-servlet-handler/>
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	// 配置视图解析器
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/pages/", ".html");
	}
}
