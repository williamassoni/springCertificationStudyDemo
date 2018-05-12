package com.demo.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	@Autowired
	private Prototype prototype;
	
	public void teste() {
		prototype.nothingHere();
		prototype.nothingHere();
	}
}