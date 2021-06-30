package testing;

public class Kitchen {

	private Fridge theFridge;
	private Oven theOven;
	private Counter theCounter;
	private Floor theFloor;
	
	public Kitchen(Fridge theFridge, Oven theOven, Counter theCounter, Floor theFloor) {
		this.theFridge = theFridge;
		this.theOven = theOven;
		this.theCounter = theCounter;
		this.theFloor = theFloor;
		
		
	}

	public Fridge getTheFridge() {
		return theFridge;
	}

	public Oven getTheOven() {
		return theOven;
	}

	public Counter getTheCounter() {
		return theCounter;
	}

	public Floor getTheFloor() {
		return theFloor;
	}
	
	public void turnOffOvenFromKitchen() {
		System.out.println("turning off oven from kitchen insted of oven class");
		theOven.turnOff();
	}
	
	
	
	
}
