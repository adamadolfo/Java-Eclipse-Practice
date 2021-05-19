package testing;

public class BarkingDog {
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay >= 0 && hourOfDay <= 23) { 
			if (hourOfDay < 8 || hourOfDay > 22) {
				if (barking == true) {
					return true;
				}
			}
		}
		return false;
	}
}
