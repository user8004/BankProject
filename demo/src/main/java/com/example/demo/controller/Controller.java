package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entitities.Instructor;
import com.example.demo.Services.InstructorService;


@RestController
public class Controller 
{
	@Autowired
	private InstructorService service;
		
		@GetMapping("/test")
		public String test()
		{
			return "test api";
		}
		
		@GetMapping("/instructor")
		public List<Instructor> getInstructor()
		{
			return this.service.getInstructor();
		}
		@GetMapping("/instructor/{instructorId}")
		public Instructor getInstructor(@PathVariable String instructorId )
		{
			return this.service.getInstructor(Long.parseLong(instructorId));
		}
		
		@PostMapping("/instructor")
		public Instructor addCourse(@RequestBody Instructor instructor)
		{
			return this.service.addInstructor(instructor);
		}
		
}

