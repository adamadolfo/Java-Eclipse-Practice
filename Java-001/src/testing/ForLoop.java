package testing;

public class ForLoop {
	
	public static void sumThreeFive () {
		
		int total = 0; 
		int counter = 0;
		
		for(int i = 1; i <= 1000; i++) {
			
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("found " + i);
				total += i;
				counter += 1;
			}
			
			if (counter == 5) {
				break;
			}
			
			
		}
		
		System.out.println("sum " + total);
	}

	

	    
		 public static boolean isOdd (int number) {
		     
		     if (number < 0) {
		        return false;
		     }
		     
		     if (number % 2 == 0) {
		         return false;
		     }
		     
		     return true;
		     
		 }
		 
		 public static int sumOdd (int start, int end) {
		     
		     int sum = 0;
		     
		     if ((end >= start) && (start > 0) && (end > 0)) {
		         
		         for (int i = start; i <= end; i++) {
		             
		             if (isOdd(i)) {
		                 sum += i;
		                 System.out.println(i);
		             }
		             
		         }
		         return sum;
		     }
		     
		     
		     return -1;
		     
		 }
		 
	
	
	
	
	
}
