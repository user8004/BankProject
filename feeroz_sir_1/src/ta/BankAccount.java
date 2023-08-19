package ta;

public class BankAccount 
{

	static String bankName;
	static String branchName;
	static String ifsc;

	int accNum;
	String accHName;
	double balance;

	Address addres;

	void deposit(double amt)
	{
		if(amt<=0)
		{
			throw new IllegalArgumentException("Dont pass negative value");
		}
		balance = balance+amt;
		alertMsg(amt,"credited");
	}

	void transfer(BankAccount recAcct,double amt)
	{
		recAcct.balance= recAcct.balance+amt;
		recAcct.alertMsg(amt,"credited");
		this.balance=this.balance-amt;
		this.alertMsg(amt,"debited");
	}
 

	private void alertMsg(double amt,String action)
	{
		System.out.println("Dear customer "+accHName+" your acct "+accNum+" had been "+action+" with amt:- "+amt);
	}
	double withdraw(double amt)
	{
		if(balance<=amt)
		{
			throw new IllegalArgumentException ("Dont pass negative value");
		}
		balance=balance-amt;
		alertMsg(amt,"debited");
		return amt;
	}
	void currentBalance()
	{
		System.out.println("Dear customer:- "+accHName+" your account balance is:- "+balance);
	}



}
