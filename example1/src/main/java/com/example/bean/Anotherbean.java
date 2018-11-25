package com.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Anotherbean {
	 @Override
	public String toString() {
		return "Anotherbean [name=" + name + "]";
	}

	private String name = "Anotherbean";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
}
