package O_Encapsulation;

import java.nio.channels.AcceptPendingException;

class BankAccount{
	
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder , double balance ) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double ammount) {
		if(ammount > 0) {
			System.out.println("Deposited: "+ammount);
		}else {
			System.out.println("Invalid deposit ammount");
		}
	}
}
public class Demo{
	public static void main(String[] args) {
		 BankAccount account = new BankAccount("Vinay", 10.0);
		 System.out.println("Current Balance: "+ account.getBalance());
		 account.deposit(500);
		 System.out.println("update balance: "+account.getBalance());
	}
	 
}