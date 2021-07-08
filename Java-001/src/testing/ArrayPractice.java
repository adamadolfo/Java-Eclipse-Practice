package testing;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayPractice {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public int[] getIntegers(int number) {
		System.out.println("Enter " + number + " numbers \r") ;
		int[] values = new int[number];
		
		for (int i=0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
		
	}
	
	public int[] sortIntegers(int[] array) {
		 Arrays.sort(array);
		 return array;
	}
	
	

	
}
