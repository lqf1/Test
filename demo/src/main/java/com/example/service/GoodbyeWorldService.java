package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"hello","defalut","dev"})
public class GoodbyeWorldService  implements MessageService{
	
	@Value("${name:aaa}")
	private String name;
	
	@Override
	public String getMessage() {
		
		return "goodye"+this.name;
	}
 

}
