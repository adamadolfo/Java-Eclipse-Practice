package testing;

public class Vehicle {
	private String name;
	private String size;
	private int currentVelo;
	private int currentDirection; 
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		
		this.currentVelo = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("vehicle.steer() steering at " + this.currentDirection);
	}

	public void move(int velocity, int direction) {
		this.currentVelo = velocity;
		this.currentDirection = direction;
		
		System.out.println("vehicle.move: moving at " + currentVelo + " in direction " + currentDirection);
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelo() {
		return currentVelo;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void stop() {
		this.currentVelo = 0;
	}
	
}
