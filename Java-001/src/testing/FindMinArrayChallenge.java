package testing;
import java.util.Scanner;

public class FindMinArrayChallenge {
		private static Scanner scanner = new Scanner(System.in);
		

		public int[] readIntegers(int count) {
			int[] array = new int[count];
			System.out.println("enter " + count + " numbers.");
			for (int i = 0; i < count; i++) {
				array[i] = scanner.nextInt();
			}
			return array;
		}

		public int findMin(int[] array) {
			boolean flag = true;
			int temp;
			while (flag) {
				flag = false;
				for (int i = 0; i < array.length - 1; i++) {
					if (array[i] > array[i + 1]) {
						temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
						
						flag = true;
					}
				}
			}
			return array[0];
		}
}
