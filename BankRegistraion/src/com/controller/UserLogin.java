package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.Service.LoginService;
import com.connection.Connect;

public class UserLogin {
public String userLogin() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the userName");
	String userName=sc.next();
	System.out.println("enter the password");
	String pass=sc.next();
	String usename = null;
	String pw=null;
	String msg = " ";
	LoginService loginservice=null;
	try
		{
			Connection con=Connect.getConnect();
			if(con!=null)
			{
				System.out.println("get Connected");
				
				String query1="select * from registration_form where user_name=? and password=?";
				PreparedStatement ps=con.prepareStatement(query1);
				ps.setString(1, userName);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					usename=rs.getString("user_name");
					pw=rs.getString("password");
				}
				
				if(usename.equals(userName) && pw.equals(pass)) {
					 //msg = "login success";
					 loginservice=new LoginService();
					 loginservice.displayOption();
				}
				else
				{
					msg="login unsuccess";
				}
				sc.close();
			}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return msg;
	}
}
