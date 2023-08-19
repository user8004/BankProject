package com.calculator;

import java.util.Scanner;

class Calculator
{
	private static Calculator calculate;
	private Calculator() {}
	public static Calculator getcalculate() 
	{
		
		if (calculate==null) 
		{
			calculate =new Calculator();
		}
	    return calculate ;
	}
	
	public int add(int a,int b) 
	{
		int c= a+b;
		return c;
	}
	public int sub(int a,int b) 
	{
		int c= a-b;
		return c;
	}
	public int mul(int a,int b) 
	{
		int c= a*b;
		return c;
	}
	public int div(int a,int b) 
	{
		int c= a/b;
		return c;
	}
}



public class Test3 
{
	
	public static void main(String[]args)
	{
		Calculator A1=Calculator.getcalculate();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter symbol (+,-,*,/)");
		String sym=sc.next();
		switch(sym)
		{
			case "+": System.out.println("result is : "+(A1.add(a, b)));
				  break;
			case "-": System.out.println("result is : "+(A1.sub(a, b)));
				  break;
			case "*": System.out.println("result is : "+(A1.mul(a, b)));
				  break;
			case "/": System.out.println("result is : "+(A1.div(a, b)));
				  break;
			default: System.out.println("invalid");
				 break;
		}
		sc.close();
	}
	
}

