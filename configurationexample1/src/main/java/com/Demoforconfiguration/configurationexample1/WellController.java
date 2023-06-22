package com.Demoforconfiguration.configurationexample1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellController {
	@Autowired
	UserConfig userconfig;
//	@Value("${my.greeting}")
//	public String greetingMsg;
//	@Value("${my.user:default value}")
//	public String userMessage;
	
	
	@GetMapping("/welcome")
	public Integer sayHi() {
		return userconfig.getGreeting();
		
	}
	@GetMapping("/welcomeu")
	public List<String> names() {
		return userconfig.getNames();
	}
	
}
