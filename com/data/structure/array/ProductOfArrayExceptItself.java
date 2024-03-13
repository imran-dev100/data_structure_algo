package com.data.structure.array;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {

		System.out.println("Input Array");
		int[] arr = { 1, 2, 3, 4 };
		printArray(arr);

		System.out.println("Result Array");
		printArray(getProductArray(arr));
	}

	private static void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	private static int[] getProductArray(int[] arr) {
		int n = arr.length;
		int[] prod = new int[n];

		int i = 0;
		int temp = 1;

		for (i = 0; i < n; i++)
			prod[i] = temp;
		
		temp = 1;

		for (i = 0; i < n; i++) {
			prod[i] = temp;
			temp = temp * arr[i];
		}
		temp = 1;

		for (i = n - 1; i >= 0; i--) {
			prod[i] = prod[i] * temp;
			temp = temp * arr[i];
		}

		return prod;
	}
}
