package com.jpa_connection.one_to_many_connection_example2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa_connection.one_to_many_connection_example2.entity.Bank;
import com.jpa_connection.one_to_many_connection_example2.service.BankService;
@RestController
public class BankController {
	@Autowired
	BankService bs;
	
	@RequestMapping("/bank")
	public List<Bank> getBankDetails() {  
		 
		return bs.getBankDetails();
	}
	@RequestMapping("/bank/{data}")
	public Bank getBank(@PathVariable("data") String  ifscNo){
		
		return bs.getBank(ifscNo);
	}
	@PostMapping("/bank")
	public void addCollege(@RequestBody Bank takeifsc){
		bs.addBank(takeifsc);
	}
	@PutMapping("/bank/{ifsc}")
	public void updateBank(@RequestBody Bank takeifsc ,@PathVariable  String ifscNo) {
		
		bs.updateBank(takeifsc, ifscNo);
	
	}
	@DeleteMapping("/bank/{ifsc}")
	public void deleteCollege(@PathVariable("ifsc") String ifscNo) {
		bs.deleteBank(ifscNo);
	}
	
}
