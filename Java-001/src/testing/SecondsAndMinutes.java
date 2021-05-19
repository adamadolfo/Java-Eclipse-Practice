/**
 * 
 */
package testing;

/**
 * @author Adam
 * 
 * This is a challenge for method overloading.
 *
 */
public class SecondsAndMinutes {
	
	public static String getDurationString(int minutes, int seconds) {
		if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
			 int hours = minutes / 60;
			 int newMinutes = minutes % 60;
			 System.out.println(hours + " h " + newMinutes + " m " + seconds + " s"); 
		}
		
		return "Invalid value";
	}
	
	 public static String getDurationString(int seconds) {
		 if (seconds >= 0) {
			 int newMinutes = seconds / 60;
			 int newSeconds = seconds % 60;
			 getDurationString(newMinutes, newSeconds);
			 
		 }
		 
		 return "Invalid value";
	 }
}
