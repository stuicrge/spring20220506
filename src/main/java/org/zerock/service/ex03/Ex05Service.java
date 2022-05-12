package org.zerock.service.ex03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.mapper.ex03.Ex03Mapper;

@Service
public class Ex05Service {

	@Autowired
	private Ex03Mapper mapper;
	
	public String getCustomerNameById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectCustomerNameById(id);
	}

	public String getEmployeeFirstNameById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectEmployeeFirstNameById(id);
	}

}
