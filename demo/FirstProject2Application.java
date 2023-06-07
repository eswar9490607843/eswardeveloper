package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Home;

@SpringBootApplication
public class FirstProject2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProject2Application.class, args);
		//Home h=new Home();
		Home h2 = context.getBean(Home.class);
		h2.connect();
		System.out.println("---------------");
		Home h3 = context.getBean(Home.class);
		h3.connect();
	}
}

