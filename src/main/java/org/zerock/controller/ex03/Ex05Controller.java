package org.zerock.controller.ex03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex05")
public class Ex05Controller {
	
	@RequestMapping("sub01")
	public void method01(HttpServletRequest request) {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		Customer cus = new Customer();
		cus.setAge(age);
		cus.setName(name);
		cus.setAddress(address);
		
		System.out.println(cus);
	}
	
	@RequestMapping("sub02")
	public void method02(Customer cus) {
		System.out.println(cus);
	}
	
	// /ex05/sub03?name=jin&age=11&address=seoul
	@RequestMapping("sub03")
	public void method03(@ModelAttribute Customer cus) {
		System.out.println(cus);
	}
	
	// /ex05/sub04?cpu=intel&hdd=1024&model=apple
	@RequestMapping("sub04")
	public void method04(Computer com) {
		System.out.println(com);
	}
	
	@RequestMapping("sub05")
	public void method05(Employee em) {
		System.out.println(em);
	}
}
