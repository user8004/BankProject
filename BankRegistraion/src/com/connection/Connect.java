 package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect 
{
	static Connection con;
	public static Connection getConnect() 
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/BanRegisterForm","postgres","Root9935");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
}
