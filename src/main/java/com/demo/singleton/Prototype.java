package com.demo.singleton;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, value = BeanDefinition.SCOPE_PROTOTYPE)
public class Prototype {

	public Prototype () {
		System.out.println("Creating a new bean of..");
	}
	
	public void nothingHere() {
		
	}
}