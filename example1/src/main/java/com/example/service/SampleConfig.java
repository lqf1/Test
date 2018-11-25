package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.bean.Anotherbean;
import com.example.bean.Examplebean;
import com.example.bean.Yetanotherbean;

@Configuration
public class SampleConfig {
	 @Bean
	 public Examplebean examplebean() {
		 Examplebean examplebean = new Examplebean();
		 examplebean.setBeanone(anotherbean());
		 examplebean.setBeantwo(yetanotherbean());
		 return examplebean;
	 }
     @Bean("aaa")
     @Primary
     public Anotherbean anotherbean() {
		// TODO Auto-generated method stub
    	 Anotherbean anotherbean=new Anotherbean();
    	 anotherbean.setName("I am anotherbean");
		return  anotherbean;
	}
@Bean
     public Yetanotherbean yetanotherbean() {
		// TODO Auto-generated method stub
		Yetanotherbean yetanotherbean=new Yetanotherbean();
		yetanotherbean.setName("I am yeanother");
		return  yetanotherbean;
      }

}

