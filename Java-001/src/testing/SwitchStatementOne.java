package testing;

public class SwitchStatementOne {
	
	public static void switchIntro() {
		int switchValue = 1; 
		switch(switchValue) {
		case 1: 
			System.out.println("Value was 1");
			break;
		
		case 2: 
			System.out.println("Value was 2");
			break;
			
		case 3: case 4: case 5: 
			System.out.println("3 4 or 5");
			System.out.println("it was " + switchValue);
		default:
			System.out.println("Value was not 1 2 3 4 5");
			break;
		}
	}
	
	public static void switchChallenge(char charValue) {
		String message = "found ";
		
		
			switch(charValue) {
			case 'A': case 'B': case 'C': case 'D': case 'E':
				System.out.println(message + charValue);
				break;
			
			default: 
				System.out.println("Character not found");
			}
			
		
	}

}
