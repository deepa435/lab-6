package lab6;

public class Account {
	String name;
	int acnum;
	double balance;
	
	public Account(String name,int Acnum,double balance) {
	this.name=name;
	this.acnum=acnum;
	this.balance=balance;
	}
	
	public void deposit(double amount) {
	if(amount<0) {
	throw new ArithmeticException("unable to withdraw");
	}
	balance = balance + amount;
	System.out.println("deposit successful");
	}
	 public void withdraw(double amount) throws InsufficientBalanceException {
		 if (amount < 0) {
			 throw new ArithmeticException("Amount cannot be negative.");
			 }
		 if (amount > balance) {
			 throw new InsufficientBalanceException("Insufficient balance.");
			 }
			 balance=balance - amount;
			 System.out.println("Withdrawal successful");
			 }
			 public void showBalance() {
			 System.out.println("Current Balance is:" +balance);
			 }

}
