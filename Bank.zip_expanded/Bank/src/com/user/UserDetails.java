package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.PostgresConnection;
import com.utility.UserUtility;

public class UserDetails {
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PostgresConnection db= new PostgresConnection();
		UserUtility userUtility = new UserUtility();
		Connection con=null;
	
		con=db.getConnection();
		
		if(con != null){
			System.out.println(" Connected");
			
		boolean flag=	userUtility.isMobileNumberExist(95425118l);
			
		if(flag == false)
		{
			String sql="insert into user_details (name,address,mobile_number,account_number,user_name,password,amount)values(?,?,?,?,?,?,?)";
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, "shifa");
			pre.setString(2, "Delhi");
			pre.setLong(3, 95425118);
			pre.setLong(4, 12345);
			pre.setString(5, "shifa123");
			pre.setString(6, "pass123");
			pre.setLong(7, 5400);
			pre.executeUpdate();
		}else{
			
			System.out.println(" Mobile Number Already Exist...");
		}
		}else{
			System.out.println(" Not Connected");
		}
	}
}
