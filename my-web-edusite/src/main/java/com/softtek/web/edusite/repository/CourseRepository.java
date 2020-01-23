package com.softtek.web.edusite.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.softtek.web.edusite.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
	
	public Optional<Course> findByCourseName(String courseName);
}