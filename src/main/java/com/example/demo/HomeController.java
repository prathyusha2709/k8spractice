package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String viewHome(){
		return "index";
	}
	@RequestMapping("/login")
	public String defectDetails() {
	    return "login";
	}

}

