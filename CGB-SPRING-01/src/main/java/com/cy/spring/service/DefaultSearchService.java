package com.cy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.spring.beans.Cache;

@Service
public class DefaultSearchService {
	
	@Autowired
	private Cache cache;

	@Override
	public String toString() {
		return "DefaultSearchService [cache=" + cache + "]";
	}
	
}
