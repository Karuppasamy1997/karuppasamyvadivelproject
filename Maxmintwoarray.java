package Karupputask;
import java.util.Arrays;

public class Maxmintwoarray {
	public static void main(String[] args) {
		int numbers[][] = { { 1, 2, 3 }, 
							{ 25, 6, 7 }, 
							{ 9, 10, 11 } };
		
		System.out.println("The 2D Array is:\n");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}

		int maxValue = numbers[0][0];
		int minValue = numbers[0][0];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] > maxValue) {
					maxValue = numbers[i][j];
				} else if (numbers[i][j] < minValue) {
					minValue = numbers[i][j];
				}
			}
		}

		System.out.println("\nMaximum element:" + maxValue);
		System.out.println("\nMinimum element:" + minValue);
	}
}