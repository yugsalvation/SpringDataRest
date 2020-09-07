package com.spring.restexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restexample.DaoImpl.CoursesDaoImple;
import com.spring.restexample.entities.Courses;

@RestController
public class HomeController {
	@Autowired
	private CoursesDaoImple cpl;
	@GetMapping("/")
	public List<Courses> get() {
		List l=cpl.getCourses();
		
		return l;
	}
	@PostMapping("/")
	public List<Courses> add(@RequestBody Courses course) {
		int x=cpl.addCourse(course);
		List l=cpl.getCourses();
		
		return l;
	}
	@PutMapping("/")
	public List<Courses> update(@RequestBody Courses course) {
		int x=cpl.updateCourse(course);
		List l=cpl.getCourses();
		
		return l;
	}
	@DeleteMapping("/{courseId}")
	public List<Courses> delete(@PathVariable String courseId) {
		int i=Integer.parseInt(courseId);
		int x=cpl.deleteCourse(i);
		List l=cpl.getCourses();
		
		return l;
	}

}
