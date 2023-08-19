package p1;

public class Important 
{
	public void m1()
	{
		System.out.println("I am in public example");
	}

	void m2()
	{
		System.out.println("I am in default example");
	}
	
	protected void m3()
	{
		System.out.println("I am in protected example");
	}
	
//	private void m4()
//	{
//		System.out.println("I am in private");
//	}
	
}

class Imp
{
	public static void main(String[] args)
	{
	Important ob = new Important();
	ob.m1();
	ob.m2();
	ob.m3();
	//ob.m4()
		

	}

}
