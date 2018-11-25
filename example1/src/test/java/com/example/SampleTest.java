package com.example;

import java.lang.annotation.Annotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.Examplebean;
import com.example.service.SampleConfig;

public class SampleTest {
	private AnnotationConfigApplicationContext context;
    
	@Before
	public void t() {
		context = new AnnotationConfigApplicationContext(SampleConfig.class);
//		context.refresh();
		context.registerShutdownHook();
		
		int count = context.getBeanDefinitionCount();
		String[] names = context.getBeanDefinitionNames();
		for (String string : names) {
			Object object = context.getBean(string);
			System.out.println(object.getClass().getName());
		}
	}
	
	@Test
	public void test() {
		String str=context.getBean("examplebean",Examplebean.class).toString();
		System.out.println(str);
	}

}
