package com.data.structure.array;

public class SmallestSubArrayWithSumGreaterThanGiven {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 0, 19 };
		int x = 51;
		System.out.println(getSmallestSubArrayWithSumGreaterThanGiven(arr, x));

		arr = new int[] { 1, 10, 5, 2, 7 };
		x = 9;
		System.out.println(getSmallestSubArrayWithSumGreaterThanGiven(arr, x));

		arr = new int[] { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
		x = 280;
		
		System.out.println(getSmallestSubArrayWithSumGreaterThanGiven(arr, x));

		arr = new int[] { 1, 2, 4 };
		x = 8;
		
		System.out.println(getSmallestSubArrayWithSumGreaterThanGiven(arr, x));
	}

	private static int getSmallestSubArrayWithSumGreaterThanGiven(int[] arr, int x) {
		int n = arr.length;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int sum = arr[i];
			int c = 1;
			if (sum > x)
				return c;
			for (int j = i + 1; j < n; j++) {
				sum += arr[j];
				c += 1;
				if (sum > x && c < min) {
					min = c;
					break;
				}
			}
		}
		
		return min==Integer.MAX_VALUE?-1:min;
	}

}
