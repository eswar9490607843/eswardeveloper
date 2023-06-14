package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
@Service
public class CollegeService {
	 List<College> collegeList=new ArrayList<> (Arrays.asList(new College("eswar","vec","nellore","101")));
	
	 public List<College> getAllCollege(){
		return collegeList;
	}

	public void addCollege(College b) {
		collegeList.add(b);		
	}

	public void updateCollege(College b, String id) {
		for (int i = 0; i <collegeList.size(); i++) {
			College res=collegeList.get(i);
			if(res.getId().equals(id)) {
				collegeList.set(i, b);
			}
		}		
	}

	public void deleteCollege(String std) {
		
	collegeList.removeIf(t->t.getId().equals("id"));
		}
	}

	


