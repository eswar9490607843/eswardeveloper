package com.firstproject_7.onetooneconnect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject_7.onetooneconnect.entity.Course;
import com.firstproject_7.onetooneconnect.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
private CourseRepository courseRepository;
	
public  List<Course>getAllCourse(String id){
	
	List<Course>courseList=new ArrayList<>();
	courseRepository.findByCollegeId(id).forEach(courseList::add);
	return courseList;
}
public Course getCourse(String id) {
	return courseRepository.findById(id).get();
}
public void addCourse(Course course) {
	courseRepository.save(course);
}
public void updateCourse(Course course) {
	courseRepository.save(course);
}
public void deleteCourse(String id) {
	
}
}
