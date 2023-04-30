package com.admin;

import java.sql.Connection;
import java.util.Scanner;

import com.connection.Connect;
import com.controller.Form;
import com.controller.UserLogin;

public class Admin {

	public static void main(String[] args) {
		Connection con = Connect.getConnect();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for the existing user");
		System.out.println("enter 2 for the new user ");

		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("login");
			UserLogin userlogin = new UserLogin();
			String status = userlogin.userLogin();
			System.out.println(status);

			break;
		case 2:
			System.out.println("Registration");
			Form.fillingForm();
			break;

		}
		sc.close();

	}

}
