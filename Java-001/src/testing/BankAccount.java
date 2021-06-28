package testing;

public class BankAccount {

	int accountNumber;
	double balance;
	String customerName;
	String email;
	int phoneNumber;
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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
