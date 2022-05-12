package org.zerock.controller.ex10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.ex03.Ex05Service;

@Controller
@RequestMapping("ex15")
public class Ex15Controller {
	@Autowired
	private Ex05Service service;
	
	@RequestMapping("sub01")
	public String method01(int id, Model model) {
		String name = service.getCustomerNameById(id);
		System.out.println(name);
		model.addAttribute("name",name);
		
		return "/ex14/sub01";
	}
	
	@RequestMapping("sub02")
	public String method02(int id, Model model) {
		String name = service.getEmployeeFirstNameById(id);
		model.addAttribute("employeeName", name);
		
		return "/ex14/sub02";
	}
}	
