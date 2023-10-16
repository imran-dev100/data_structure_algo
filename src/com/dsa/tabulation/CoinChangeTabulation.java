package com.dsa.tabulation;

import java.util.Arrays;

public class CoinChangeTabulation {

	private static int coinChange(int[] coins, int amount) {

		int init = amount + 1;
		int[] cache = new int[init];
		Arrays.fill(cache, init);
		cache[0] = 0;

		for (int i = 1; i <= amount; i++)
			for (int coin : coins)
				if (i - coin >= 0)
					cache[i] = Math.min(cache[i], cache[i - coin] + 1);

		return cache[amount] == init ? -1 : cache[amount];
	}

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		System.out.println(coinChange(coins, 11));
	}
}
