package com.jpa_connection.one_to_many_connection_example2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa_connection.one_to_many_connection_example2.entity.Bank;
import com.jpa_connection.one_to_many_connection_example2.repository.BankRepository;
@Service
public class BankService {
	BankRepository br;
	public List<Bank> getBankDetails() {
		List<Bank> blist = new ArrayList();
		br.findAll().forEach(blist::add);
		return blist;
	}
	public Bank getBank(String ifsc) {
		return br.findById(ifsc).get();
	}
	public void addBank(Bank ifsc) {
		br.save(ifsc);
	}
	public void updateBank(Bank takeifsc, String ifsc) {
        br.save(takeifsc);		
	}
	public void deleteBank(String ifsc) {
		br.deleteById(ifsc);
	}
}
