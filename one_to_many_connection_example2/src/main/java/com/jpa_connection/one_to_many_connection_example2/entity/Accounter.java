package com.jpa_connection.one_to_many_connection_example2.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Accounter {
	@Id
private String accNum;
private String name;
private String money;

@ManyToOne
 Bank bank;


public Accounter() {
	super();
	// TODO Auto-generated constructor stub
}
public Accounter(String accNum, String name, String money) {
	super();
	this.accNum = accNum;
	this.name = name;
	this.money = money;
	this.bank=new Bank("","","");
}
public String getAccNum() {
	return accNum;
}
public void setAccNum(String accNum) {
	this.accNum = accNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMoney() {
	return money;
}
public void setMoney(String money) {
	this.money = money;
}
public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}

}
