package com.example;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	private AnnotationConfigApplicationContext context;
	
	@Test
	public void InitialContext() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.example");
		context.registerShutdownHook();
		
		int count = context.getBeanDefinitionCount();
		System.out.println("beand的个数"+count);
		String [] names = context.getBeanDefinitionNames();
		
		
		
		
	}
}
