package com.java.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.controller.FController;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("classpath:app_config.xml");
		// main메소드 안에선 Autowired못쓰니까 getBean쓰면서 객체 만들어서 가져오는 것임.. 나중엔 안쓸거.
		FController fController = ctx.getBean(FController.class);	
		
		fController.serviceList();
	}
}
