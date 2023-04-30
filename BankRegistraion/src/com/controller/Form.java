 package com.controller;


import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Random;
import java.util.Scanner;



import com.connection.Connect;
import com.utility.Utility;

public class Form 
{
	
	public static void fillingForm()
	{
		Utility utility=new Utility();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name:-");
		String name=sc.next();
		System.out.println("Enter Address:-");
		String address=sc.next();
		System.out.println("Enter MobNo:-");
		Long mobNo=sc.nextLong();
		if(utility.duplicateMobileNumber(mobNo)) {
			System.out.println("mobNo already exist");
			System.exit(0);
		}
		//Long acctno=utility.generateAcctNo();
		System.out.println("userName:-");
		String userName=sc.next();
		if(utility.duplicateUserName(userName)) {
			System.out.println("username already exist");
			System.exit(0);
		}
		
		System.out.println("Enter Password:-");
		String pass=sc.next();
		System.out.println("Enter Amount:-");
		Long amt=sc.nextLong();
		try
		{
			Connection con=Connect.getConnect();
		if(con!=null)
		{
			
			System.out.println("connected");
			String q1=" insert into registration_form (name,address,mobile_no,acct_no,user_name,password,amout) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(q1);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setLong(3, mobNo);
			ps.setLong(4, utility.generateAcctNo() ); 
			ps.setString(5, userName);
			ps.setString(6, pass);
			ps.setLong(7, amt);
			
			ps.executeUpdate();
			System.out.println("data has been inserted");
		 }
		else
		{
			System.out.println("not connected");
		}
		sc.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
	}
}
