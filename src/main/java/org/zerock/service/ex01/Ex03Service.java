package org.zerock.service.ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.controller.ex03.Customer;
import org.zerock.mapper.ex01.Ex01Mapper;

@Service
public class Ex03Service {
	
	@Autowired
	private Ex01Mapper mapper;
	
	

	public int getNumber() {
		// TODO Auto-generated method stub
		int number=mapper.selectNumber();
		
		return number;
	}
}
