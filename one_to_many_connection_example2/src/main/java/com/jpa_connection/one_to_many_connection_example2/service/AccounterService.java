package com.jpa_connection.one_to_many_connection_example2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa_connection.one_to_many_connection_example2.entity.Accounter;
import com.jpa_connection.one_to_many_connection_example2.repository.AccountRepository;
@Service
public class AccounterService {
	@Autowired
	AccountRepository arep;
	public List<Accounter> getDisplayAccounts(String ifscNo) {
		List<Accounter> accList=new ArrayList<>();
		arep.findByBankIfscNo(ifscNo).forEach(accList::add);
		return accList;
	}
	public Accounter getAccounts(String accNum) {
		return arep.findById(accNum).get();
	}
	public void addBanks(Accounter accounter) {
		arep.save(accounter);
	}
	public void updateAccounters(Accounter accounter) {
		arep.save(accounter);
	}
	public void deleteAccounters(String accNum) {
       	arep.findById(accNum);	
	}

}
