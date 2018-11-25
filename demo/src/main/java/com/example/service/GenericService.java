package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile({"generic"})
public class GenericService implements MessageService{
      
	@Value("${name:world}")
	private String name;
	
	@Value("${hello:hello}")
	private String hello;
	
	@Override
	public String getMessage() {
		
		return "goodye"+this.name;
	}
}
