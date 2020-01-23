package com.softtek.web.edusite.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControllerApp {
	@Value("${jacademy.app.title}")
	private String appTitle,appCourse;

	@GetMapping("/")
	public String goInicio(Model model) {
		return "index";
	}
	
	@GetMapping("/index.html")
	public String goHome(Model model) {
		List<String> chsarp = Arrays.asList(
				"C#");
	
		model.addAttribute("jaTitle",appCourse);
		model.addAttribute("titles",chsarp);
		
		List<String> java = Arrays.asList(
				"Java");
	
		model.addAttribute("jaTitle",appCourse);
		model.addAttribute("titlej",java);
		
		List<String> phyton = Arrays.asList(
				"Phyton");
	
		model.addAttribute("jaTitle",appCourse);
		model.addAttribute("titley",phyton);
		return "index";
		
		
	}
	
	@GetMapping("/blog-post.html")
	public String goAbout(Model model) {
		List<String> courses = Arrays.asList(
				"Java","Html","SQL","Spring","Web");
	
		model.addAttribute("jaTitle",appTitle);
		model.addAttribute("courses",courses);
		return "blog-post";
	}
	
	@GetMapping("/blog.html")
	public String goBlog(Model model) {
		return "blog";
	}
	
	@GetMapping("/contact.html")
	public String goContact(Model model) {
		return "contact";
	}
}
