package my_trial_1;
class A
{
	public void m1()
	{
		System.out.println("this is A.m1");
	}
	public void m2()
	{
		System.out.println("this is B.m2");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("this is B.m1");
		
	}
	public void m2()
	{
		System.out.println("this is B.m2");
		this.m3();
	}
	public void m3()
	{
		System.out.println("this is B.m3");
		
	}
}

class C extends B
{
	public void m()
	{
		System.out.println("this is C.m3");
	}
}
public class ThisDemo1 {

	public static void main(String[] args) 
	{
	A ob = new C();
	ob.m2();

	}

}
