package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
 @Value("123")
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public HelloWorldService(String name) {
	super();
	this.name = name;
}

public void sayHello() {
	// TODO Auto-generated method stub
	 System.out.println("hello " + this.name);
	
}


}
