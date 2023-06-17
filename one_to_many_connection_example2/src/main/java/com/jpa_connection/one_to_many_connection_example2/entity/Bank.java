package com.jpa_connection.one_to_many_connection_example2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
	@Id
private String ifscNo;
private String bankName;
private String villege;
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
public Bank(String ifscNo, String bankName, String villege) {
	super();
	this.ifscNo = ifscNo;
	this.bankName = bankName;
	this.villege = villege;
}
public String getIfscNo() {
	return ifscNo;
}
public void setIfscNo(String ifscNo) {
	this.ifscNo = ifscNo;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getVillege() {
	return villege;
}
public void setVillege(String villege) {
	this.villege = villege;
}

}
