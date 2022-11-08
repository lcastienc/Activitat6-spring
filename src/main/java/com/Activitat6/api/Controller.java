package com.Activitat6.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Activitat6.api.entity.Course;
import com.Activitat6.api.repository.CourseRepository;


@RestController
public class Controller {
	@Autowired
	CourseRepository prova;
	
	@GetMapping("Courses")
	public List<Course> getCourses(){
		List<Course> Listaprova = prova.findAll();
		return Listaprova;
	}
	
	@GetMapping ("Courses/{Id}")
	public Course getCoursesById(@PathVariable long Id) {
		Course A1 = prova.findById(Id).get();
		return A1;
	}
}
