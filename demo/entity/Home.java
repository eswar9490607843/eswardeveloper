package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.controller.TopicController;

@Component
@Scope(value="prototype")
public class Home {
	private String owner;
	private int doorNo;
	@Autowired
	InternetConnection cn;
	TopicController tc;
	
	public  Home(){
		System.out.println("hello");  
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void connect() {

		cn.switchOn();
		System.out.println("connecting to internet");
//		tc.getAllTopic();
//		InternetConnection ic=new InternetConnection();
//		ic.switchOn();

	}

}
