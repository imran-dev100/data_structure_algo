package com.technique.tabulation;

import java.util.Arrays;

public class CoinChangeTabulation {
	private static int coinChange(int[] coins, int amount) {

		int init = amount + 1;

		// Initializing cache of 1 size greater than amount
		int[] cache = new int[init];

		// Populate cache with 1 size greater than amount
		Arrays.fill(cache, init);

		// Fill index 0 of cache with value 0
		cache[0] = 0;

		// Populate cache
		for (int i = 1; i <= amount; i++)
			for (int coin : coins)
				if (i - coin >= 0)
					cache[i] = Math.min(cache[i], cache[i - coin] + 1);

		// Check if amount index does not have initial value
		return cache[amount] == init ? -1 : cache[amount];
	}

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		System.out.println(coinChange(coins, 11));
	}
}
