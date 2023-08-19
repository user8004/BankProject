package p1;

class Parent1
{
	void m1()
	{
		System.out.println("Parent");
	}

	public void m2() 
	{
		System.out.println("Child");
		
	}
}

class Child123 extends Parent1
{
//	 void m2()
//	{
//		System.out.println("Child");
//	}
	 void m1()
	 {
		 System.out.println("Child2");
	 }

}

public class MethodHidd extends Parent1
{
	
	public static void main(String[] args)
	{
		
		Parent1 obj=new Child123();
		obj.m1();
		obj.m2();
	}

}
