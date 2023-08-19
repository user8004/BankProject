package ta;
class A
{
	public void propose()
	{
		System.out.println("Anushka");
	}
}
class B extends A
{
	public void propose()
	{
		System.out.println("Deepika");
	}
}
class C extends B
{
	public void propose()
	{
		System.out.println("kateina");
	}
}

public class Test01 {

	public static void main(String[] args) {
		A a1= new C();
a1.propose();
	}

}
