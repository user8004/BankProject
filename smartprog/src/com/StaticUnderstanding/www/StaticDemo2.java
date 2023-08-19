package com.StaticUnderstanding.www;
class PageVisitors
{
	static int count=0;
	PageVisitors()
	{
		count=count+1;
		System.out.println("Visitor : "+count);
	}
//	void noOfVisitors()
//	{
//		System.out.println(count);
//	}
}
public class StaticDemo2 
{
	public static void main(String[] args)
	{
		PageVisitors v1=new PageVisitors();
		PageVisitors v2=new PageVisitors();
		PageVisitors v3=new PageVisitors();
		PageVisitors v4=new PageVisitors();
		PageVisitors v5=new PageVisitors();

		//v1.noOfVisitors();
	}

}
