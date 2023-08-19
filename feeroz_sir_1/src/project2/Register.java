package project2;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner reg = new Scanner(System.in);
		System.out.println("Name is:");
		String name = reg.next();
		System.out.println("Address is :");
		String addr = reg.next();
		System.out.println("gender is:");
		char gender = reg.next().charAt(0);
		System.out.println("phone no:");
		long contact=reg.nextLong();
		System.out.println("----------------------------------------------------------");
		System.out.println("name:--"+name);
		System.out.println("Address is:-- "+addr);
		System.out.println("gender:--"+gender);
		System.out.println("phone noumber:--"+contact);
	}

}
