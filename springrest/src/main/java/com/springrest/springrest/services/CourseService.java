package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getcourse(long courseId);

	public Course addCourse(Course course);
	
	public List<Course> savelistofcourse(List<Course> course);

	public Course updateCourse(Course course);

	public void deleteCourse(Long parseLong);

	
	

	
	
	
	
	



	
}
