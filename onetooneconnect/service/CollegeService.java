package com.firstproject_7.onetooneconnect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject_7.onetooneconnect.entity.College;
import com.firstproject_7.onetooneconnect.repository.CollegeRepository;
@Service
public class CollegeService {
	@Autowired
	CollegeRepository cr;
	// List<College> collegeList=new ArrayList<> (Arrays.asList(new College("eswar","vec","nellore","101")));
	
	 public List<College> getAllCollege(){
		 List<College> elist=new ArrayList();
		 cr.findAll().forEach(elist::add);
		 return elist;
	}

	public void addCollege(College c) {
		cr.save(c);		
	}

	public void updateCollege(College b, String id) {
		cr.save(b);
		
	}

	public void deleteCollege(String std) {
		cr.deleteById(std);
		
		}
	}

	


