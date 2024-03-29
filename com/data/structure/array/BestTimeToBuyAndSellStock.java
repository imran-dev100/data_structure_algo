package com.data.structure.array;

public class BestTimeToBuyAndSellStock {
//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//    Return the maximum profit you can achieve from this transaction. 
	public static void main(String[] args) {
		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
//		System.out.println(maxProfit(prices));
		bestTime(prices);
	}

	public static int maxProfit(int[] prices) {
		int lsf = Integer.MAX_VALUE;
		int op = 0;
		int pist = 0;
		int n = prices.length;

		for (int i = 0; i < n; i++) {

			if (prices[i] < lsf)
				lsf = prices[i];

			pist = prices[i] - lsf;
			if (op < pist)
				op = pist;

		}
		return op;
	}

	public static void bestTime(int[] prices) {
    	
    	int maxProfit = 0;
    	int dayToBuy = -1;
    	int dayToSell = -1;
    	
    	int n  = prices.length;
    	
    	for(int i = 0; i< n-1; i++) 
    		for(int j=i+1; j<n; j++) 
    			if(prices[j] - prices[i] > maxProfit) {
    				maxProfit = prices[j] - prices[i];
    				dayToBuy = i+1;
    				dayToSell = j+1;
    			}
    	
    	System.out.println("maximum profit: "+maxProfit);
    	System.out.println("day to buy stock: "+dayToBuy);
    	System.out.println("day to sell stock: "+dayToSell);
    }
}
