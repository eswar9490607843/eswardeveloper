package com.jpa_connection.one_to_many_connection_example2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jpa_connection.one_to_many_connection_example2.entity.Accounter;
import com.jpa_connection.one_to_many_connection_example2.entity.Bank;
import com.jpa_connection.one_to_many_connection_example2.service.AccounterService;

public class AccounterController {
@Autowired
AccounterService as;

@GetMapping("/bank/{ifscNo}/accounter")
public List<Accounter> displayAccounts(@PathVariable String ifscNo){
	return as.getDisplayAccounts(ifscNo);
}
@GetMapping ("/bank/{ifscNo}/accounter")
public Accounter getAccount(@PathVariable String accNum) {
	return as.getAccounts(accNum);
}
@PostMapping("/bank/{ifscNo}/accounter")
public void addBank(@RequestBody Accounter accounter,@PathVariable String ifscNo) {
	accounter.setBank(new Bank(ifscNo,"",""));
	as.addBanks(accounter);
}
@PutMapping("/bank/{ifscNo}/accounter")
public void updateBank(@RequestBody Accounter accounter,@PathVariable String ifscNo) {
	accounter.setBank(new Bank(ifscNo,"",""));
	as.updateAccounters(accounter);
}
@DeleteMapping("/bank/{ifscNo}/accounter/{accNum}")
public void deleteAccounter(@PathVariable String accNum) {
	as.deleteAccounters(accNum);
}
}
