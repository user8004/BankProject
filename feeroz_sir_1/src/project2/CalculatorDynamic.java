package project2;

import java.util.Scanner;

public class CalculatorDynamic
{

	public static void main(String[] args)
	{
		Scanner ob1 = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int number1=ob1.nextInt();
		
		System.out.println("enter the second number");
		int number2=ob1.nextInt();
		
		System.out.println("pls select the operater");
		char operator=ob1.next().charAt(0);
		
		switch(operator)
		{
		case'+':
		{
			System.out.println("the sum is:-  "+(number1+number2));
			break;
		}
		case'-':
		{
			System.out.println("the sub is:-  "+(number1-number2));
			break;
		}
		case'*':
		{
			System.out.println("the multiplication is:-   "+(number1*number2));
			break;
		}
		case'/':
		{
			System.out.println("the division is:-  "+(number1/number2));
			break;
		}	
	}	

}
}
