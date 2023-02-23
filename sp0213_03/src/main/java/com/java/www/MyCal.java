package com.java.www;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor		//기본생성자 만들어줌
@AllArgsConstructor		//전체생성자 만들어줌
@Data //getter, setter 자동으로 만들어줌 lombok통해서.
@Component
public class MyCal {
	private int firstNum;
	private int secondNum;
	
	public void add_class() {
		System.out.println("클래스 add : " + (10 + 5));
	}

}
