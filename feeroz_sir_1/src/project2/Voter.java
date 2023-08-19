package project2;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("please insert the age");
		int age = ob.nextInt();
		if(age>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}

	}

}
