package com.Demoforconfiguration.configurationexample1;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//	@GetMapping("/hello")
//    public String sayHi() {
//	return "welcome";
//}
	@Value("${my.greeting}")
	public String greetingMsg;
	@GetMapping("hello")
	public String sayHi() {
		return greetingMsg;
	}
	@Value("${my.user:default value}")
	public String userMessage;
	@GetMapping("user")
	public String userCall() {
		return userMessage;
	}
	@Value("${my.list.names}")
	public List<String> listNames;
	@GetMapping("namesGet")
	public List<String> names() {
		return listNames;
	}
	@Value("#{${dbDetails}}")
	public Map<String,String> getDbInfo;
	@GetMapping("dbinfo")
	public Map<String,String> getDb(){
		return getDbInfo;
	}
	
}
