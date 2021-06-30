package testing;

public class Fridge {
	private String brand; 
	private boolean full;
	
	public Fridge(String brand, boolean full) {
		this.brand = brand;
		this.full = full;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isFull() {
		return full;
	}
	
	public void eat() {
		full = false;
	}
	
	public void shop() {
		full = true;
	}
	

}
