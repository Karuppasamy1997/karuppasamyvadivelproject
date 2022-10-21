package org.vendingmachine;

public class Insertionsort5 {
	public Insertionsort5(int[] arr) {
		int n = arr.length;
		for (int t = 0; t < n; t++) {
			int key = arr[t];
			int j = t - 1;
			while (j > -1 && (arr[j] > key)) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 44, 6, 8, 2332, 35, 67, 542 };
		System.out.println("before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		Insertionsort5 ob = new Insertionsort5(arr);
		System.out.println();
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}
}
