package Karupputask;

import java.util.Arrays;

public class Arrayinsertion {



	public Arrayinsertion(int[] arr) {

		int n = arr.length;
		for (int j = 1; j < n; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;

		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 14, 3, 2, 43, 0, 58, 22 };

		System.out.println("Before Insertion Sort: " + Arrays.toString(arr));

		Arrayinsertion obj = new Arrayinsertion(arr);

		System.out.println("\nAfter Insertion Sort: " + Arrays.toString(arr));

	}
}
