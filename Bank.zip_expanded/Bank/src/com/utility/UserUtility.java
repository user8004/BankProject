package com.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.db.PostgresConnection;

public class UserUtility {

	
public	Boolean isMobileNumberExist(Long Mobile) {
		
		PostgresConnection db= new PostgresConnection();
		Connection con=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			try {
				con=db.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sql="select count(*) as mobile_count from user_details where mobile_number=? and is_active is true";
			
			PreparedStatement pre= con.prepareStatement(sql);
			pre.setLong(1, Mobile);
		    rs=pre.executeQuery();
		    
		    while (rs.next()) {
				
			Long mNumber=rs.getLong("mobile_count");
			System.out.println("mNumber >>> "+mNumber);
			
			if(mNumber <= 3){
				return true;
			}
			}
		 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}

 boolean isAAdhaarDuplicate(){
	 return false;
 }
 
 boolean isAccount(){
	 return false;
 }


}
