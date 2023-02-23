package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.java.service.MService;

@Controller
public class FController {
	
	@Autowired
	MService mservice; //함수 밖에 놔야 다른 함수들도 쓸 수 있을 것.
	
	public void serviceSelectAll() {
		
		System.out.println("서비스에서 데이터값을 전달합니다.");
		String id = mservice.memberSelectAll();
		System.out.println("service 메소드 호출 후 데이터 값 : " + id);
	}

}
