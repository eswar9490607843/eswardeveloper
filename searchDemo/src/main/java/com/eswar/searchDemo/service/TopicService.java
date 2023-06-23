package com.eswar.searchDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.stereotype.Service;

import com.eswar.searchDemo.entity.Topic;
import com.eswar.searchDemo.repository.TopicRepository;
@Service
public class TopicService {
	
	@Autowired
	TopicRepository tr;
	
	List<Topic>topicList=new ArrayList<> (Arrays.asList(new Topic("101","eswar","java"),new Topic("102","ravi","sql")));
	
	public List<Topic> getAllTopic(){
		//return topicList;
		List<Topic> tList=new ArrayList();
		
		tr.findAll().forEach(tList::add);
		return tList;
	}
//	public Topic getTopic(String id) {
//		
//		return tr.findById(id).get();
//
//	}
	public void addTopic(Topic t) {
//		topicList.add(t);		
		tr.save(t);
	}
	public List<Topic> searchProducts(String query) {
		System.out.println(query);
		List<Topic> output = tr.searchTopic(query);
		System.out.println(output);
		return output;
	}
	
	public Page<Topic> getProductsByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
//		int page, int size, Direction direction, String... properties
		return	tr.findAll(
				PageRequest.of(
						pageParam.orElse(0),  //page number
						3)); // sort based on column
	}

}


