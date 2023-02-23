package com.java.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:bean.xml"); // src/main/resources안에 bean.xml들어가있을 때
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/www/bean.xml"); // src/main/java 안에 bean.xml들어가있을 때
		MyCal myCal = ctx.getBean("myCal",MyCal.class);
		
		myCal.add();
		myCal.sub();
		
	}//main
	
}//class
