package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entitities.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService
{

	List<Instructor> list;
	
	public InstructorServiceImpl()
	{
		List<Instructor> a=new ArrayList<>();
		list.add(new Instructor(145,"himanshu2@gmail.com","Himanshu","Rahul","8989564232"));
	    list.add(new Instructor(144,"daraksha@gmail.com","Daraksha","Shyam","8123454232"));
		list.add(new Instructor(143,"sudhanshu2@gmail.com","Sudhanshu","Parul","8989564321"));
		list.add(new Instructor(142,"Siddhi@gmail.com","Siddhi","sidharth","8989564232"));
		
		
	}
	
	@Override
	public List<Instructor> getInstructor() 
	{
		return list;
	}

	
	@Override
	public Instructor addInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructor getInstructor(long parseLong) {
		// TODO Auto-generated method stub
		return null;
	}

}

//List a = new List();
//a.mtd()

