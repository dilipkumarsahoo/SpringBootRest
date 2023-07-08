package com.springrest.springrest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}

	// get the courses
	@GetMapping("/Allcourses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}

	// get course by id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable Long courseId) {
		return this.courseService.getcourse(courseId);
	}

	// save only one course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

	// Save list of course
	@PostMapping("/savelistofcourse")
	public List<Course> savelistofcourse(@RequestBody List<Course> course) {
		return this.courseService.savelistofcourse(course);
	}

	// update course
	@PutMapping("/updatecourses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}

	// delete course
	@DeleteMapping("/delete/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long courseId) {
		try {
			this.courseService.deleteCourse(courseId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
