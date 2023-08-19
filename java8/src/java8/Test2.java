package java8;

@FunctionalInterface
interface I2
{
	void m2();
}
public class Test2
{

	public static void main(String[] args)
	{
		I2 i=() -> System.out.println("this lambda function");
		i.m2();

	}

}
