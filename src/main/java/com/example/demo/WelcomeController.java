package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WelcomeController {
	@Value("${welcome.message1}")
	private String message = "Hello World";
	
	@Value("${welcome.message2}")
	private String message2 = "Hello World";

	@RequestMapping("/")
	public String sasa(Map<String, Object> model) {
	System.out.println("SACHIN");
		model.put("message", this.message);
		model.put("message2", this.message2);
		return "welcome";
	}

}
