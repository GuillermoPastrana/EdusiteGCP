package com.softtek.web.edusite;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.softtek.web.edusite.entity.Course;
import com.softtek.web.edusite.service.CourseService;

@SpringBootApplication
public class MyWebEdusiteApplication implements CommandLineRunner{
	
	@Autowired
	CourseService courseService;

	public static void main(String[] args) {
		SpringApplication.run(MyWebEdusiteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course csharp = new Course();
		csharp.setCourseName("C#");
		csharp.setInstructor("edson.alvarez");
		
		Course phyton = new Course();
		phyton.setCourseName("Phyton");
		phyton.setInstructor("guido.rodriguez");
		
		Course java = new Course();
		java.setCourseName("Java");
		java.setInstructor("matheus.uribe");

		Optional<Course> course = courseService.findByCourseName("edson.alvarez");
		if (!course.isPresent()) {
			courseService.createCourse(csharp);
		}
		course = courseService.findByCourseName("guido.rodriguez");
		if (!course.isPresent()) {
			courseService.createCourse(phyton);
		}
		course = courseService.findByCourseName("matheus.uribe");
		if (!course.isPresent()) {
			courseService.createCourse(java);
		}
		
	}

}
