package project1;

public class Calculator {

	public static void main(String[] args) 
	{
		int no1=10;
		int no2=70;
		char c='-';
		
		switch(c)
		{
		
		case '+':System.out.println("result is "+(no1+no2));
		break;
		case '-':System.out.println("result is "+(no1-no2));
		break;
		case '*':System.out.println("result is "+(no1*no2));
		break;
		case '/':System.out.println("result is "+(no1/no2));
		break;
		}
	}

}
