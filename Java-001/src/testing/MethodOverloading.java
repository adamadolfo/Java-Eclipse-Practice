/**
 * 
 */
package testing;

/**
 * @author Adam
 * Method overloading is creating multiple methods with the same name with different parameters.
 */
public class MethodOverloading {
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points.");
		return score;
	}
	
	public static int calculateScore(int score) {
		System.out.println("unnamed player" + " scored " + score + " points.");
		return score;
	}
	
	public static int calculateScore() {
		System.out.println("empty");
		return 0;
	}
}
