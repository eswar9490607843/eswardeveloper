package com.eswar.topic_JPA;

import java.util.Arrays;
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
public class TopicController {
	@Autowired
	TopicService ts;
//	@RequestMapping("/mam")
//   public String getAllTopic() {
//	   return "Alltopic";
//   }
	@RequestMapping("/topic")
	public List<Topic> getAllTopic(){
       return ts.getAllTopic();
	}
	@RequestMapping("/topic/{data}")
	public Topic getTopicName(@PathVariable("data") String id) {
		return ts.getTopic(id);
	}
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic t) {
		ts.addTopic(t);
	}
	@PutMapping("/topic/{id}")
	public void updateTopic(@RequestBody Topic t,@PathVariable String id) {
		ts.updateTopic(t,id);
	}
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable("id") String tid) {
		ts.deleteTopic(tid);
	}
}
