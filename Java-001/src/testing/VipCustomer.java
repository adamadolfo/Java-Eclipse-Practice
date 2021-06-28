package testing;

public class VipCustomer {
	String name;
	int creditLimit;
	String email;
	
	public VipCustomer() {
		this("default name", 1000, "default email");
	}
	
	public VipCustomer(String name, int creditLimit) {
		this(name, creditLimit, "default email");
	}
	
	public VipCustomer(String name, int creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}

	
}
