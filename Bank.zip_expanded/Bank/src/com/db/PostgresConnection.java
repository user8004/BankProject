package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

	 Connection con= null;
	 
	public Connection getConnection() throws ClassNotFoundException{
		 try {
			 Class.forName("org.postgresql.Driver");
			 	 con =DriverManager.getConnection("jdbc:postgresql://localhost:5433/coll","postgres","postgres");
			 return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return con;
	 }
	 
}
