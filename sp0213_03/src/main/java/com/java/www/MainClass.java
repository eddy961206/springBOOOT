package com.java.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/java/www/cal_config.xml");
		MyCal myCal = ctx.getBean(MyCal.class); // 지금방식
		
//		@Autowired
//		MyCal myCal;	// 나중방식
		
		myCal.add_class();
		
//		add(myCal);		
	}
	
	public static void add(MyCal myCal) {
		int result = myCal.getFirstNum() + myCal.getSecondNum();
		System.out.println("결과값 : " + result);
	}

}
