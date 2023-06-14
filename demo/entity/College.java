package com.example.demo.entity;

public class College {
   String name;
   String clgName;
   String place;
   String id;
   
   
public College() {
	super();
	// TODO Auto-generated constructor stub
}
public College(String name, String clgName, String place, String id) {
	super();
	this.name = name;
	this.clgName = clgName;
	this.place = place;
	this.id = id;
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
   
}
