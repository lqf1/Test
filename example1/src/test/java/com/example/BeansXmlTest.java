package com.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.LifeBean;
import com.example.service.HelloWorldService;

public class BeansXmlTest {

	private AbstractApplicationContext context;
	
	@Test
	public void testHelloWorldService() {
		context= new ClassPathXmlApplicationContext("beans.xml");
		context.getBean("helloService",HelloWorldService.class).sayHello();
		
	}
	
	@Test
	public void testHelloWorld() {
		context= new ClassPathXmlApplicationContext("beans.xml");
		context.getBean("LifeBean",LifeBean.class);
		context.registerShutdownHook();
		
	}
	

}
