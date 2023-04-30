package com.util.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.connection.Connect;

public class Services {
	String msg = "";
	Scanner sc = new Scanner(System.in);
	Long acctNo;
	Connection con = null;
	PreparedStatement stmt;
	Long newmobNo;
	String user;
	Long mob;
	String userName;
	Long mobNo;
	String newPassword;
	Long depositAmt;
	Long origAmt;
	Long withdrawAmt;
	int rs2;
	boolean b;

	public String getDetail() {
		System.out.println("Enter the account no:-");
		acctNo = sc.nextLong();

		try {
			con = Connect.getConnect();

			stmt = con.prepareStatement("select * from registration_form where acct_no=?");
			stmt.setLong(1, acctNo);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.print("Name:-");
				System.out.println(rs.getString("name"));
				System.out.print("add:-");
				System.out.println(rs.getString("address"));
				System.out.print("mob:-");
				System.out.println(rs.getString("mobile_no"));
				System.out.print("accountNo:-");
				System.out.println(rs.getString("acct_no"));
				System.out.print("User_Name:-");
				System.out.println(rs.getString("user_name"));
				System.out.print("PW:-");
				System.out.println(rs.getString("password"));
				System.out.print("Amount:-");
				System.out.println(rs.getString("amout"));
				System.out.print("is_active:-");
				System.out.println(rs.getString("is_active"));
				System.out.print("created_date:-");
				System.out.println(rs.getString("created_date"));

			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		return msg;
	}

	public void changeMobNo() {

		System.out.println("enter your account no");// 240420231006
		acctNo = sc.nextLong();
		System.out.println("enter the new MobNo");
		newmobNo = sc.nextLong();
		ResultSet rs1;

		try {
			con = Connect.getConnect();

			String query1 = "update registration_form set mobile_no=? where acct_no=?";
			PreparedStatement stmt = con.prepareStatement(query1);

			stmt.setLong(1, newmobNo);
			stmt.setLong(2, acctNo);

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("contact no updated");
	}

	public String changePass() {
		System.out.println("enter your user name");// 240420231006
		userName = sc.next();
		System.out.println("enter the Mob No");
		mobNo = sc.nextLong();
		System.out.println("enter the new password");
		newPassword = sc.next();
		ResultSet rs1;
		

		try {
			con = Connect.getConnect();
			String query = "Select user_name,mobile_no from registration_form where user_name=? and mobile_no=?";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, userName);
			stmt.setLong(2, mobNo);
			rs1 = stmt.executeQuery();
			while (rs1.next()) {
				user = rs1.getString(1);
				mob = rs1.getLong(2);
				break;
			}

			if (userName.equals(user) && mob.equals(mobNo)) {
				String query1 = "update registration_form set password=? where user_name=?";
				stmt = con.prepareStatement(query1);
				stmt.setString(1, newPassword);
				stmt.setString(2, userName);
				stmt.executeUpdate();
				return "updated";
			}

			else {
				throw new IllegalArgumentException("no account exist");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;

	}

	public void deposit() {
		System.out.println("enter your account no");// 240420231006
		acctNo = sc.nextLong();
		System.out.println("enter the amount to deposit");
		depositAmt = sc.nextLong();
		ResultSet rs1;

		try {
			con = Connect.getConnect();
			String query = "Select amout from registration_form where acct_no=? and is_active=true";

			stmt = con.prepareStatement(query);
			
			stmt.setLong(1, acctNo);
			stmt.setBoolean(2, b);
			
			
			
			if(b==true)
			{
				rs1 = stmt.executeQuery();
				while (rs1.next()) {
					origAmt = rs1.getLong(1);
					break;
				}
			}
			else
			{
				System.out.println("not working account");
			}
			
			
			String query1 = "update registration_form set amout=? where acct_no=?";
			stmt = con.prepareStatement(query1);
			if (depositAmt < 0) {
				throw new IllegalArgumentException("Dont pass negative value");
			}
			origAmt = origAmt + depositAmt;

			stmt.setLong(1, origAmt);
			stmt.setLong(2, acctNo);

			rs2 = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("amt updated");
	}

	public String withdraw()

	{
		System.out.println("enter your account no");// 240420231006
		acctNo = sc.nextLong();
		System.out.println("enter the amount to withdraw");
		withdrawAmt = sc.nextLong();
		ResultSet rs1;
		int rs2;
		try {
			con = Connect.getConnect();
			String query = "Select amout from registration_form where acct_no=? and is_active=true";

			stmt = con.prepareStatement(query);
			stmt.setLong(1, acctNo);
		//stmt.setBoolean(2, b);
			rs1 = stmt.executeQuery();
			while (rs1.next()) {
				origAmt = rs1.getLong(1);
				break;
			}
//			if(b==true)
//			{
//				
//			}
//			else
//			{
//				System.out.println("not working account");
//			}
			
			String query1 = "update registration_form set amout=? where acct_no=?";
			stmt = con.prepareStatement(query1);
			if (withdrawAmt >= origAmt) {
				throw new IllegalArgumentException("Dont pass negative value");
			}
			origAmt = origAmt - withdrawAmt;

			stmt.setLong(1, origAmt);
			stmt.setLong(2, acctNo);

			rs2 = stmt.executeUpdate();
			if (rs2 > 1) {
				System.out.println("amt updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg="new amount is "+origAmt;
	}

	public void active(boolean is_active) {

		

		System.out.println("Enter the account no:-");
		acctNo = sc.nextLong();

		try {
			con = Connect.getConnect();

			stmt = con.prepareStatement("update registration_form set is_active=false where acct_no=?");
			stmt.setLong(1, acctNo);
			int i = stmt.executeUpdate();
			if (i > 1) {
				System.out.println("updated");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		
	}

}
