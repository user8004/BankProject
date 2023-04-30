package com.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.connection.Connect;

public class Utility {

	public Long generateAcctNo() {
		Long acctno = null;
		String dynamicNo = null;

		Connection con = null;
		try {
			con = Connect.getConnect();

			PreparedStatement stmt = con.prepareStatement("Select nextval('acct') as account");

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				dynamicNo = rs.getString("account");
			}
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
			String strDate = formatter.format(date);
			System.out.println(dynamicNo + "currentDate:" + strDate);
			acctno = Long.parseLong(strDate.concat(dynamicNo));

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return acctno;
	}

	public boolean duplicateMobileNumber(Long mob) {

		Long count = null;
		Connection con = null;
		try {
			con = Connect.getConnect();

			PreparedStatement stmt = con
					.prepareStatement("Select count(*) as mobile from registration_form where mobile_no=?");
			stmt.setLong(1, mob);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				count = rs.getLong("mobile");
			}
			if (count > 1) {
				return true;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean duplicateUserName(String name) {

		Long count = null;
		Connection con = null;
		try {
			con = Connect.getConnect();

			PreparedStatement stmt = con
					.prepareStatement("Select count(*) as username from registration_form where user_name=?");
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				count = rs.getLong("username");
			}
			if (count > 1) {
				return true;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
