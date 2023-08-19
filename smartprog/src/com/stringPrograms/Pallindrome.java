package com.stringPrograms;

public class Pallindrome 
{

	public static void main(String[] args)
	{
		String name="ana";
		int leng=name.length();
		String rev="";
		System.out.println("leng:-"+leng);
		for(int i=leng-1;i>=0;i--)
		{
			//System.out.print(name.charAt(i));
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equals(rev))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}

}
