package com.softtek.web.edusite.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softtek.web.edusite.entity.Course;
import com.softtek.web.edusite.repository.CourseRepository;

@Service
public class CourseService {
	private CourseRepository courseRepository;
	
	@Autowired
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public List<Course> getCourses() {
		List<Course> courses = new ArrayList<>(); 
		courseRepository.findAll().forEach(courses::add);;
		return courses;
	}

	public Optional<Course> findByCourseName(String courseName) {
		return courseRepository.findByCourseName(courseName);
	}

}
