package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	

	
	public CourseServiceImpl() {
	}
	
	//get all data
	@Override
	public List<Course> getCourses() {		
		return this.courseDao.findAll();
	}

	//get data by id
	@Override
	public Course getcourse(long courseId) {
		return this.courseDao.findById(courseId).orElse(null);
	}

	//Save
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	//Save all data
	@Override
	public List<Course> savelistofcourse(List<Course> course) {
		// TODO Auto-generated method stub
		return this.courseDao.saveAll(course);
	}

	//Update
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	//Delete
	@Override
	public void deleteCourse(Long parseLong) {
		courseDao.deleteById(parseLong);
		
//		added for testing of commit
	//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}

	

	

	


}
