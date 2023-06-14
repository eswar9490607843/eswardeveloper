package com.firstproject_7.onetooneconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
   String name;
   String clgName;
   String place;
   @Id
   String cid;
   
   
public College() {
	super();
	// TODO Auto-generated constructor stub
}
public College(String name, String clgName, String place, String cid) {
	super();
	this.name = name;
	this.clgName = clgName;
	this.place = place;
	this.cid = cid;
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
	return cid;
}
public void setId(String cid) {
	this.cid = cid;
}
   
}
