package testing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SpeedConverter.printConversion();
//		MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
		
		// method overkloading example
//		MethodOverloading.calculateScore("Adam", 500);
//		MethodOverloading.calculateScore(455);
//		MethodOverloading.calculateScore();
		
		// seconds and minutes
//		SecondsAndMinutes.getDurationString(2139, 5);
//		SecondsAndMinutes.getDurationString(232525);
		
		//switch practice
//		SwitchStatementOne.switchChallenge('C');
		
		//for loop practice
//		ForLoop.sumThreeFive();
//		System.out.println(ForLoop.sumOdd(1, 11));
		
		//classes practice with getters and setters
//		Dog lucy = new Dog();
//		
//		lucy.setName("Lucy");
//		System.out.println(lucy.getName());
		
		//getter and setter bank practice
		BankAccount first = new BankAccount();
		
		first.setAccountNumber(1);
		
		System.out.println(first.getAccountNumber());
		
		first.setBalance(0.00);
		
		System.out.println(first.getBalance());
		
		first.setCustomerName("First Customer");
		
		System.out.println(first.getCustomerName());
		
		first.setEmail("first@first.com");
		
		System.out.println(first.getEmail());
		
		first.setPhoneNumber(1111111111);
		
		System.out.println(first.getPhoneNumber());
		
		first.deposit(5.00);
		
		System.out.println(first.getBalance());
		
		 first.withdraw(4.00);
		 
		 System.out.println(first.getBalance());
		
	}

}
