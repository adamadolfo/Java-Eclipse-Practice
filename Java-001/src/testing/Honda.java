package testing;

public class Honda extends Car {
	private int roadService;

	public Honda(int roadService) {
		super("Honda", "sedan", 4, 4, 4, false);
		this.roadService = roadService;
	}
	
	public void accelerate(int rate) {
		int newVelo = getCurrentVelo() + rate;
		
		if (newVelo == 0) {
			stop();
			changeGear(1);
		} else if (newVelo > 0 && newVelo <= 10) {
			changeGear(1);
		} else if (newVelo > 10 && newVelo <= 20) {
			changeGear(2);
		} else if (newVelo > 20 && newVelo <= 30) {
			changeGear(3);
		} else {
			changeGear(4);
		}
	
		if (newVelo > 0) {
			changeVelo(newVelo, getCurrentDirection());
		}
	}
}
