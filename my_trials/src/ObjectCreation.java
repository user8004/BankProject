class Animal
{
	void eat(int a)
	{
		System.out.println("I am eating"+a);
	}
	void run()
	{
		System.out.println("I am running");
	}
}
class ObjectCreation
{
	public static void main(String[] args)
	{
		Animal ob=new Animal();
		ob.eat(20);
		ob.run();

	}

}
