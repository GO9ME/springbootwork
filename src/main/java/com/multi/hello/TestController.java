package com.multi.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("msg", "spring boot test ...###^^ ");

		// 기본 설정이 뷰 InternalResourceViewResolver
		// prefix => /resource폴더에 있는 template이 기본설정
		// subfix => .html
		return "thymeleaf/hello";
	}

	@GetMapping("/jsptest")
	public String jsptest(Model model) {
		model.addAttribute("msg", "spring boot jsp test");

		return "test/basic";
	}

	@GetMapping("/index2")
	public String index2() {

		return "index2";
	}

	@GetMapping("/index")
	public String index() {

		return "index";
	}
	
	@GetMapping("/emp/login")
	public String login() {

		return "login";
	}
}
