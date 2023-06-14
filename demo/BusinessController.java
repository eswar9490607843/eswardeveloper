package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {
	@Autowired
	BusinessService bs;

	@RequestMapping("/business")
	public List<Business> getAllBusinessData(){
       return bs.getAllBusinessData();
	}
	@PostMapping("/business")
	public void addBusiness(@RequestBody Business b) {
		bs.addBusiness(b);
		
	}
	
//	@PutMapping("/business/{owner}")
//	public void updateTopic(@RequestBody Business b,@PathVariable String owner ) {
//		bs.updateBusiness(b,owner);
//	}
	@DeleteMapping("/business/{owner}")
	public void deletBusiness(@PathVariable("owner")String std) {
		 bs.deletBusiness(std);
	}
	
}
