package com.cy.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class DefaultCache implements Cache {
	public DefaultCache() {
		System.out.println("DefaultCache()");
	}
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	@PreDestroy
	public void close() {
		System.out.println("close()");
	}
}
