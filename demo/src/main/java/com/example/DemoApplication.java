package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
/*	@Value("${name}")
	private String name;
	*/
    @RequestMapping("") 
   public String hello() {
    	return"hello world";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
