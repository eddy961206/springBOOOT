package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.service.Service;

@Component
public class FController {
	
	@Autowired
	Service service;	//인터페이스 선언
	
	public void serviceList() {
		String id = service.list();
		System.out.println("DB에서 가져온 ID : " + id);
	}

}
