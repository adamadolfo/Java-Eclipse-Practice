package testing;

public class SpeedConverter {
	public static void main(String[] args) {
		
		double kilometersPerHour = 10;
		
		printConversion(kilometersPerHour);
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		}
		
		return (long) Math.round(kilometersPerHour / 1.609);
			
	}
	
	public static void printConversion(double kilometersPerHour) {
		long speed = toMilesPerHour(kilometersPerHour);
		if (speed == -1) {
			System.out.println("Invalid Value");
		} else {	
			System.out.println(kilometersPerHour + "km/h = " + speed + "mi/h.");
		}
		
	}
	
}
