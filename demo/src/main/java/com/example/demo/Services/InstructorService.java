package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entitities.Instructor;

public interface InstructorService
{
	public List<Instructor> getInstructor();

	public Instructor getInstructor(long parseLong);

	public Instructor addInstructor(Instructor instructor);

	
}
