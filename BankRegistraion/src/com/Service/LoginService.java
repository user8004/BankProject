package com.Service;

import java.sql.Connection;
import java.util.Scanner;

import com.connection.Connect;
import com.util.service.Services;

;
//import com.utility.AcctUtilDemo;

public class LoginService {

	Services services = new Services();
	Connection con = Connect.getConnect();
	Scanner sc = new Scanner(System.in);

	public void displayOption() {
		System.out.println("Press1 check acct details");
		System.out.println("Press2 withdraw amt");
		System.out.println("Press3 deposit amt");
		System.out.println("Press4 Mobile no update");
		System.out.println("Press5 Acct del");
		System.out.println("Press6 changing password");

		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("acctDetails");
			services.getDetail();
			break;
		case 2:
			System.out.println("withdrawAmt");

			 services.withdraw();
			//System.out.println("New amount is" + res);
			break;

		case 3:
			System.out.println("depositAmt");
			services.deposit();
			break;

		case 4:
			System.out.println("updateMobNo");

			services.changeMobNo();
			break;

		case 5:
			System.out.println("acctDeactivate");

			 services.active(true);
			System.out.println("deactive");

			break;
		case 6:
			System.out.println("changePassword");

			String pw = services.changePass();
			System.out.println(pw);

			break;
		}

		sc.close();

	}

}
