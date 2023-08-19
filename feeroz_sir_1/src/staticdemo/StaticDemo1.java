package staticdemo;

class Employee
{
	int empid;
	String empname;
	
	Employee(int empid, String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	void display()
	{
		
		System.out.println("Employee id is "+empid);
		System.out.println("Employee name is  "+empname);
		System.out.println("--------------------------------");
	}
}

public class StaticDemo1 
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee(101,"Deepak");
		Employee e2 = new Employee(102,"Guddu");
		Employee e3 = new Employee(103,"Siddharth");
		Employee e4 = new Employee(104,"Dipti");
		Employee e5 = new Employee(105,"Drishti");
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		
	}

}
