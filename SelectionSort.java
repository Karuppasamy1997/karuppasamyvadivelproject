package org.vendingmachine;

public class SelectionSort {
	public static void main(String[] args) {
		int arrays[] = { 5, 1, 2, 3, -5, 15, };
		for (int i : arrays) {
		System.out.print(+i);
		}
		System.out.println();
		Selectionso(arrays);
		System.out.println("selectoin sort");
		for (int i : arrays) {
			System.out.print(+i);}}
	private static void Selectionso(int[] arrays) {
		for (int i = 0; i < arrays.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[j] < arrays[index]) {
					index = j;
					System.out.println(index);}}
			int smallerNumber = arrays[index];
			arrays[index] = arrays[i];
			arrays[i] = smallerNumber;
			System.out.println(arrays[i]);
		}}}
