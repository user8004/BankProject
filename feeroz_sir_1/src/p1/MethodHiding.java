package p1;
class Par
{
	// static key word is hiding the parent class method
	static void m1()
	{
		System.out.println("Parent");
		
	}
}
public class MethodHiding extends Par
{
	 static void m1()
	{
		System.out.println("Child");
	}
	public static void main(String[] args)
	{
//		MethodHiding obj1 = new MethodHiding();
//		obj1.m1();
		
		
//		Par ob2 = new Par();
//		ob2.m1();
		
		Par ob3 = new MethodHiding();
		ob3.m1();

	}

}
