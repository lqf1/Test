package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.HelloWorldService;

public class sampleMain {
	private static String count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //1.获取context上下文(作为Spring容器)
       ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
       //2.创建实例（注意并不是通过new的方式）
       int i=context.getBeanDefinitionCount();
       System.out.println("bean的个数"+ count );
       String[] names=context.getBeanDefinitionNames();
       for(String string : names) {
    	   System.out.println(string+"--");
    	   Object bean=context.getBean(string);
    	   System.out.println(bean.getClass());

       }
       context.getBean("helloworldService", HelloWorldService.class).sayHello();
       
       HelloWorldService hello=(HelloWorldService) context.getBean("helloWorldService");
	}
}
