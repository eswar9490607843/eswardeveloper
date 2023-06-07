package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class BusinessService {
	List<Business>businessList=new ArrayList<> (Arrays.asList(new Business("Book",1001,"ravi"),new Business("pen",1002,"vinay"),new Business("pad",1003,"praddep")));
	
	public List<Business> getAllBusinessData() {
		return businessList;
	}
	public void addBusiness(Business b) {
		businessList.add(b);
	}
//	public void updateBusiness(Business b, String owner ) {
//		for (int i = 0; i <businessList.size(); i++) {
//			Business res=businessList.get(i);
//			if(res.getNameOfBusiness().equals(owner)) {
//				businessList.set(i, b);
//			}
//		}		
//	}
	public void deletBusiness(String owner) {
		businessList.removeIf(t->t.getOwner().equals("owner"));
	}
	  
	
	}

