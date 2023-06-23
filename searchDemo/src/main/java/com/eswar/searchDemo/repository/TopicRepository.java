package com.eswar.searchDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eswar.searchDemo.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,String> {
	@Query("select p from Topic p  where "+
			"p.name like concat('%', :query, '%')"+
			" OR p.description like concat('%', :query, '%')")
	List<Topic> searchTopic(String query);

}
