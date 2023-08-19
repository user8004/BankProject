package p1;

abstract class Parent12
{
	void m1()
	{
		System.out.println("this is parent class");
	}
	
	abstract void m2(int a);
	abstract String m3();
	
	
}
public class AbDemo1 extends Parent12
{

	public static void main(String[] args) 
	{
		AbDemo1 ob = new AbDemo1();
		ob.m2(2);
		ob.m3();

	}

//	@Override
//	void m2(45) 
//	{
//		System.out.println("1");
//		
//	}

	@Override
	String m3() 
	{
		System.out.println("2");
		return "Gaurav";
	}

	@Override
	void m2(int a)
	{
	System.out.println("1"+a);
		
	}

}
