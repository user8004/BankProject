package com.stringPrograms;

public class RevString
{

	public static void main(String[] args) 
	{
		String name="gaurav";
		int leng=name.length();
		String rev="";
		System.out.println("leng:-"+leng);
		for(int i=leng-1;i>=0;i--)
		{
			//System.out.print(name.charAt(i));
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
