package ta;

public class Bank
{
	public static void main(String [] args) 
	{
		BankAccount acct1=new BankAccount();
		BankAccount.bankName="AllahabadBank";
		BankAccount.branchName="BrijEnclave";
		BankAccount.ifsc="Alla0120";
		acct1.accNum=123456;
		acct1.accHName="Anwar";
		acct1.balance=100000;
		acct1.addres=new Address();
		acct1.addres.strtNo=3;
		acct1.addres.colony="humnagar";
		acct1.addres.state="up";
		acct1.addres.city="varanasi";
		acct1.currentBalance();

		BankAccount acct2=new BankAccount();
		acct2.accNum=123456789;
		acct2.accHName="Axar";
		acct2.balance=200000;
		acct2.currentBalance();

		BankAccount acct3=new BankAccount();
		acct3.accNum=1234567890;
		acct3.accHName="Amar";
		acct3.balance=300000;
		//acct3.deposit(500000);
		//acct3.withdraw(700000);
		acct3.currentBalance();
		acct3.transfer(acct2,10000);
		acct3.currentBalance();
		acct2.currentBalance();
	}

}
