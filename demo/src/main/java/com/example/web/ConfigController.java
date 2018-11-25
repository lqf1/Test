package com.example.web;

import javax.swing.Spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ConfigBean;
import com.example.bean.User;
import com.example.service.GoodbyeWorldService;
import com.example.service.HelloWorldService;
import com.example.service.MessageService;
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes=ConfigController.class)
//@EnableConfigurationProperties({ConfigBean.class,User.class,HelloWorldService.class})
@RestController
public class ConfigController {
	
	@Autowired
	private ConfigBean configBean;
	
	@RequestMapping("/a")
	public String jj() {
		System.out.println(configBean.toString());
		return configBean.toString();
		

	}
	
	@Autowired
	 private User user;
	 @RequestMapping("/user")
	 public String u() {
		 return user.toString();
	 }
	 @Test
	 public void name() {
      System.out.println(user.toString());
	}
	 public static void main(String[] args) {
		System.out.println("aaa");
	}
	 
	 @Autowired
	 public HelloWorldService helloWorldService;
	 @RequestMapping("/h")
	 public String h() {
		  return helloWorldService.getMessage();
	 }
	 
	@Autowired
	 public GoodbyeWorldService goodbyeWorldService;
	 @RequestMapping("/g")
	 public String g() {
		  return goodbyeWorldService.getMessage();
	 }
}
