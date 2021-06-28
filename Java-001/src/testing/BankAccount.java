package testing;

public class BankAccount {
	

	int accountNumber;
	double balance;
	String customerName;
	String email;
	int phoneNumber;
	
	public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber ) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	
	public String getEmail() {
		return this.email;
	}

	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount) {
		if (this.balance >= withdrawAmount) {
			this.balance -= withdrawAmount;
		} else {
			System.out.println("insufficient funds");
		}
	}
}
