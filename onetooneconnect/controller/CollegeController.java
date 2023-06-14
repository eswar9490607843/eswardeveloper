package com.firstproject_7.onetooneconnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject_7.onetooneconnect.entity.College;
import com.firstproject_7.onetooneconnect.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	CollegeService cs;
	@RequestMapping("/college")
   public List<College> getAllCollege(){
	   return cs.getAllCollege();
   }
	@PostMapping("/college")
	public void addCollege(@RequestBody College b) {
		cs.addCollege(b);
	}
	@PutMapping("/college/{id}")
	public void updateCollege(@RequestBody College b,@PathVariable String id ) {
		cs.updateCollege(b,id);
	}
	@DeleteMapping("/college/{id}")
	public void deleteCollege(@PathVariable("id")String std) {
		 cs.deleteCollege(std);
	}
}
