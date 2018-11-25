package com.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Yetanotherbean {
    @Override
	public String toString() {
		return "Yetanotherbean [name=" + name + "]";
	}

	private String name = "Yetanotherbean";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
   
}
