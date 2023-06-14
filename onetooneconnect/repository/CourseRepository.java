package com.firstproject_7.onetooneconnect.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.firstproject_7.onetooneconnect.entity.Course;

public interface CourseRepository extends CrudRepository<Course ,String>{

  List<Course> findByCollegeId(String id);
 // List<Course> findByCollegeName(String id);
	//findByProperty		
	
	
}

