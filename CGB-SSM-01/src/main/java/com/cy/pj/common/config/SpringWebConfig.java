package com.cy.pj.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 此类负责请求处理层配置(Spring MVC中的V,C)
 * @author UID
 */
@ComponentScan("com.cy.pj.goods.controller")
@EnableWebMvc
@Configuration
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
