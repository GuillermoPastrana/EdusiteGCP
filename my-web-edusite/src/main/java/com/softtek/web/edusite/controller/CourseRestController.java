package com.softtek.web.edusite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.edusite.entity.Course;
import com.softtek.web.edusite.service.CourseService;


@RestController
public class CourseRestController {

private CourseService courseService;
	
	@Autowired
	public CourseRestController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	public List<Course> getCourses() {
	    return courseService.getCourses();
	  
	}
}
