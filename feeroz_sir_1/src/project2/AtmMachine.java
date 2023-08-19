package project2;

import java.util.Scanner;

public class AtmMachine 
{

	public static void main(String[] args)
	{
		int actualpin=1234;
		int balance=10000;
		int withdraw;
		int deposit;
		
		System.out.println("pls insert your card");
		Scanner ob = new Scanner(System.in);
		System.out.println("please enter your pin");
		int pin=ob.nextInt();
		
			if(pin==actualpin)
			{
				System.out.println("Your pin is correct");
			}
		else
			{
				System.out.println("pls enter the correct pin");
			}
		
		
		System.out.println("choose your language");
		System.out.println("press 1 for hindi and press 2 for english");
		int lang=ob.nextInt();
		
		if(lang==1)
			{
				System.out.println("you have chosen hindi language");
			}
		
		else if(lang==2)
		{
			System.out.println("you have chosen english language");
		}
		
			else
			{
				System.out.println("enter right language");
			}
		
		
		while(true)
		{
			System.out.println("enter 1 for withdraw");
			System.out.println("enter 2 for deposite");
			System.out.println("enter 3 for balance enquiry");
			System.out.println("enter 4 for exit");
			
			int choice = ob.nextInt();
			
			switch(choice)
			{
			case 1:System.out.println("Enter amt to be withdraw");
			
			withdraw=ob.nextInt();
			
			if(withdraw<=balance)
			{
				balance=balance-withdraw;
				System.out.println("pls collect ur money");
				System.out.println("remaining balance:--"+balance);
			}
			else
			{
				System.out.println("insuffiecient balance");
			}
			break;
			
			
			
			case 2:System.out.println("enter the amt to be deposited");
			deposit=ob.nextInt();
			balance =balance+deposit;
			System.out.println("your balance is "+balance);
			break;
			
			
			
			case 3: System.out.println("total balance is "+balance);
			break;
			
			
			
			case 4:System.exit(0);
			}
		}
	}
}

