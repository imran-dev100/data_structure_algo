package com.data.structure.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RotateArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		rotateArray(a, a.length, 3);
		System.out.println("---------------");
		rotateArrayUsingQueue(a, a.length, 3);

	}

	private static void rotateArrayUsingQueue(int[] a, int n, int r) {
		final Deque<Integer> queue = new ArrayDeque<>();

		for (int i : a)
			queue.addLast(i);

		for (int k = 0; k < r; k++)
			queue.addFirst(queue.pollLast());

		while (!queue.isEmpty())
			System.out.println(queue.pollFirst());
	}

	private static void rotateArray(int[] a, int n, int r) {

		for (int k = 0; k < r; k++) {
			final int temp = a[n - 1];
			for (int i = n - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
		}
		Arrays.stream(a).forEach(System.out::println);
	}
}
