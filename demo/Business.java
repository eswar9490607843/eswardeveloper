package com.example.demo;

public class Business {
private String nameOfBusiness;
private double idOfBusiness;
private String owner;

public Business() {
	super();
}
public Business(String nameOfBusiness, double idOfBusiness, String owner) {
	super();
	this.nameOfBusiness = nameOfBusiness;
	this.idOfBusiness = idOfBusiness;
	this.owner = owner;
}
public String getNameOfBusiness() {
	return nameOfBusiness;
}
public void setNameOfBusiness(String nameOfBusiness) {
	this.nameOfBusiness = nameOfBusiness;
}
public double getIdOfBusiness() {
	return idOfBusiness;
}
public void setIdOfBusiness(double idOfBusiness) {
	this.idOfBusiness = idOfBusiness;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}

}
