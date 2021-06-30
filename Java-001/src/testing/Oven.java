package testing;

public class Oven {
	private String brand; 
	private int heat;
	
	public Oven(String brand, int heat) {
		this.brand = brand;
		this.heat = heat;
	}

	public String getBrand() {
		return brand;
	}

	public int getHeat() {
		return heat;
	}
	
	public void turnOff() {
		heat = 0;
	}
	
	public void turnOn(int newHeat) {
		heat = newHeat;
	}
}
