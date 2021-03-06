package com.cy.pj.common.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	/** 加载service，dao的配置 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses()");
		return null;
	}

	/** 加载spring mvc配置(controller,viewresolver,..) */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses()");
		return new Class[] {SpringWebConfig.class};
	}

	/**指定DispatcherSerlvet对象的请求映射路径*/
	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings()");
		return new String[] {"/"};
	}

}
