package com.eswar.topic_JPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	public Topic getTopic(String id) {
		//    	for (int i = 0; i <topicList.size() ; i++) {
		//			
		//    		Topic res = topicList.get(i);
		//    		System.out.println("------------------");
		//    		
		//    		if(res.getId()=="101")
		//    		{
		//    			return res;
		//    		}
		//		    	}

		//		for(Topic x:topicList) {
		//			if(x.getId()=="102") {
		//				return x;
		//			}
		//		}
		//
		//		Topic empty = new Topic();
		//		return empty;
//		Topic eswar = topicList.stream().filter(a -> a.getId().equals(id)).findFirst().get();
//		return eswar;
		
		return tr.findById(id).get();

	}
	public void addTopic(Topic t) {
//		topicList.add(t);		
		tr.save(t);
	}
	public void updateTopic(Topic t, String id) {
//		for (int i = 0; i <topicList.size(); i++) {
//			Topic res=topicList.get(i);
//			if(res.getId().equals(id)) {
//				topicList.set(i, t);
//			}
//		}
		
		tr.save(t);
	}
	public void deleteTopic(String tid) {
		// TODO Auto-generated method stub
//		topicList.removeIf(t->t.getId().equals(tid));
		tr.deleteById(tid);
	}



}


