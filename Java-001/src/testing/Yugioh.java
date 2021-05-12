package testing;

public class Yugioh {
	public static void main(String[] args) {
		int blueEyes= 3000;
		int darkMagician = 2500;
		int yugiLife = 4000;
		int kaibaLife = 4000;
	
		System.out.println( battle(darkMagician, blueEyes, yugiLife, kaibaLife) );
	}


	public static int battle(int attack1, int attack2, int life1, int life2) {
		if (attack1 > attack2) {
			return life2 -= (attack1 - attack2);
		} else {
			return life1 -= (attack2 - attack1);
		}
	}

}
