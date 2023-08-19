package com.stringPrograms;

public class CountSrtringWords
{

	public static void main(String[] args) 
	{
		String str="this is demo";
		int count=0;
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			 if(str.charAt(i)==' ')
					 {
				 		flag=true;
					 }
			 else if(flag==true)
			 {
				 
				 count++;
				 flag=false;
			 }
		}
		System.out.println("No of words is:"+count);

	}

}
