package org.zerock.controller.ex04;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Ex07Controller {
	
	@RequestMapping("sub01")
	public String method1() {
	//	1. request 파라미터 수집 가공
	//  2. business 로직 처리
	//  3. add attribute
	//  4. forward redirect
	
		return "redirect:https://www.naver.com";
	}

	@RequestMapping("sub02")
	public String method2(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String location = request.getContextPath() + "/ex06/sub01";
		
		return null;
	}
	
	@RequestMapping("sub03")
	public String method02() {
		return "redirect:/ex06/sub01";
	}
	
	
	private HttpServletRequest getContextPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("sub04")
	public String method03() {
		
		return "redirect:/ex06/sub05";
	}
}
