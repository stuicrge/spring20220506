package org.zerock.controller.ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")

public class Ex06Controller {
	@RequestMapping("sub01")
	public String method01() {
		
		
		
		return "myview01"; // prefix : /WEB-INF/views/
							// suffix: .jsp\
							// full view name = /WEB-INF/views/myview01.jsp
	}
	
	@RequestMapping("sub02")
	public String method02() {
		return "myview02";
	}
	
	@RequestMapping("sub03")
	public String method03() {
		return "ex06/myview03";
	}
	
	@RequestMapping("sub04")
	public String method04() {
		return null;
	}
	
	@RequestMapping("sub05")
	public void method05() {
		// 요청경로와 view(jsp)의 경로가 같은경우
		// void로 리턴 타입 작성 가능
		
		
	}
	
	
	
}
