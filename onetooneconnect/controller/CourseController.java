package com.firstproject_7.onetooneconnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject_7.onetooneconnect.entity.College;
import com.firstproject_7.onetooneconnect.entity.Course;
import com.firstproject_7.onetooneconnect.service.CourseService;
@RestController
public class CourseController {
	@Autowired
	CourseService courseServices; 

	@GetMapping("/college/{id}/course")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseServices.getAllCourse(id);
	}

	@GetMapping("/college/{Id}/courses/{id}")
	public Course getCourses(@PathVariable String id) {
		return courseServices.getCourse(id);
	}
	@PostMapping("/college/{Id}/courses")
	public void AddCourse(@RequestBody Course Course,@PathVariable String Id) {
		Course.setCollege(new College(Id,"","",""));
		courseServices.addCourse(Course);
	}
	@PutMapping("/College/{id}/Courses/id")
	public void updateCourse(@RequestBody Course Course,@PathVariable String id) {
		Course.setCollege(new College(id,"","",""));
		courseServices.updateCourse(Course);
	}
	@DeleteMapping("/college/{Id}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		
	}
}

