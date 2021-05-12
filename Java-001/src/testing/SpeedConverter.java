package testing;

public class SpeedConverter {
	public static void main(String[] args) {
		
		double kilometersPerHour = 90;
		
//		System.out.println(toMilesPerHour(kilometersPerHour));
		printConversion(kilometersPerHour);
		
	}
	
//	public static long toMilesPerHour(double kilometersPerHour) {
//		if (kilometersPerHour < 0) {
//			return -1;
//		}
//		
//		return 
//			
//	}
	
	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long speed = Math.round(kilometersPerHour / 1.609);
			System.out.println(kilometersPerHour + "km/h = " + speed + "mi/h.");
		}
		
	}
	
}
