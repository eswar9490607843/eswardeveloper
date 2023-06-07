package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContolItByBrowser {
	@RequestMapping("/hello")
public String callItBrowser() {
//	System.out.println("this is the browser out put");
		return "this is browser result";
}
	@RequestMapping("/")
	public int addition() {
		int a =10;
		int b=20;
		int c=a+b;
		return c;
		
	}
//	@RequestMapping("/")
//	public void listExample() {
//		 int[] a= new int[4];
//		 a[0]=22;
//		 a[1]=30;
//		 a[2]=40;
//		 a[3]=50;
//		 a[4]=60;
//		 for (int i = 0; i < a.length; i++) {
//			System.out.println(i);
//		}
		 
//	}
}
