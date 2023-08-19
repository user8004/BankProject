package p1;
class Parent3
{
	void methodOfParentClass()
	{
		System.out.println("Parent's method");
	}
}

class Child52 extends Parent3
{
	void methodOfParentClass()
	{
		super.methodOfParentClass();
		System.out.println("Child's method");
	}
}

public class MethodOverRidding 
{

	public static void main(String[] args)
	{
		Parent3 obj = new Child52();
		obj.methodOfParentClass();
	}

}
