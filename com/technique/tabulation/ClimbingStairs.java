package com.technique.tabulation;

/**
 *
 * You are climbing a staircase. It takes n steps to reach the top. Each time
 * you can either climb 1 or 2 steps. In how many distinct ways can you climb to
 * the top?
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbingStairs2D(3));
		System.out.println(climbingStairs1D(3));
	}

	private static int climbingStairs2D(int n) {

		int[] cache = new int[n + 1];
		cache[0] = 1;
		cache[1] = 1;

		for (int i = 2; i <= n; i++)
			cache[i] = cache[i - 1] + cache[i - 2];

		return cache[n];
	}

	private static int climbingStairs1D(int n) {

		int x = 1;
		int y = 1;

		for (int i = 2; i <= n; i++) {
			int temp = x + y;
			y = x;
			x = temp;
		}
		
		return x;
	}
}
