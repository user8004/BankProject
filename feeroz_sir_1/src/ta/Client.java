package ta;

public class Client 
{

	public static void main(String[] args)
	{
		DemoGetSet1 ob=new DemoGetSet1();
		ob.setAcctNo(123);
		System.out.println(ob.getAcctNo()); 
		ob.setName("Sid");
		System.out.println(ob.getName()); 

	}

}
