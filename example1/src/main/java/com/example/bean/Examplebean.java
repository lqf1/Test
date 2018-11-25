package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Examplebean {
   @Autowired
	private Anotherbean beanone;
	@Autowired
	private Yetanotherbean beantwo;
	
	private int i;
	
  public Examplebean() {}
  
  public Examplebean(Anotherbean beanone, Yetanotherbean  beantwo, int i) {
    super();
    this.beanone=beanone;
    this.beantwo=beantwo;
    this.i=i;
   
}

public Anotherbean getBeanone() {
	return beanone;
}

public void setBeanone(Anotherbean beanone) {
	this.beanone = beanone;
}

public Yetanotherbean getBeantwo() {
	return beantwo;
}

public void setBeantwo(Yetanotherbean beantwo) {
	this.beantwo = beantwo;
}

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}

@Override
public String toString() {
	return "Examplebean [beanone=" + beanone + ", beantwo=" + beantwo + ", i=" + i + "]";
}
}
