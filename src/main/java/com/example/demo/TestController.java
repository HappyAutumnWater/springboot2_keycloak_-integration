package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
class TestController {

	@GetMapping(path = "/phones")
	public String getProducts(Model model){
		model.addAttribute("phones", Arrays.asList("Mate20 pro","Galaxy S10+","P30 pro","Oneplus 7pro"));
		return "phones";
	}

	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}
