package com.eswar.searchDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eswar.searchDemo.entity.Topic;
import com.eswar.searchDemo.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	TopicService ts;

	@RequestMapping("/topic")
	public List<Topic> getAllTopic(){
       return ts.getAllTopic();
	}
//	@RequestMapping("/topic/{data}")
//	public Topic getTopicName(@PathVariable("data") String id) {
//		return ts.getTopic(id);
//	}
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic t) {
		ts.addTopic(t);
	}
	//localhost:8081/search?query=food
		@GetMapping("/search")
		public ResponseEntity<List<Topic>> searchProducts(
				@RequestParam("query") String query){
			System.out.println("---------------");
			return ResponseEntity.ok(ts.searchProducts(query));
		}
		//localhost:8080/topics/page?pageNo=1&sort=name
		@GetMapping("/topics/page")
		public  Page<Topic>  getTopicsByPage(
				@RequestParam("pageNo") Optional<Integer> pageParam,
				@RequestParam("sort") Optional<String>  sortBy){
			return ts.getProductsByPage(pageParam,sortBy);
		}
	
}
