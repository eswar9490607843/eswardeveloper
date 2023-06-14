package com.firstproject_7.onetooneconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

	private String name;
	private String clgName;
	private String place;
	@Id
	private String id;
	
	@ManyToOne
	College college;
	
	public Course() {
		super();
	}
	public Course(String name, String clgName, String place, String id) {
		super();
		this.name = name;
		this.clgName = clgName;
		this.place = place;
		this.id = id;
		this.college =new College("","","","");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}

    
}
