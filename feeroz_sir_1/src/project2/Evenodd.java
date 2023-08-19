package project2;

import java.util.Scanner;

public class Evenodd 
{

	public static void main(String[] args)
	{
		Scanner ob= new Scanner(System.in);
		System.out.println("please insert the number");
		int no = ob.nextInt();
		if(no%2==0)
		{
			System.out.println("it is an even number");
		}
		else
		{
			System.out.println("it is an odd number");
		}

	}

}
