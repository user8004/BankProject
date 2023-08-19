package selection_statement_d;

public class Greater_no1 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
			if(a>b)
			{
				if(a>c) 
				{
					System.out.println("a is greatest no");
				}
				else
				{
					System.out.println("c is greater no");
				}
			}
			else if(b>c)
			{
				System.out.println("b is gratest no");
			}
			else
			{
				System.out.println("c is great no");
			}
	}

}
