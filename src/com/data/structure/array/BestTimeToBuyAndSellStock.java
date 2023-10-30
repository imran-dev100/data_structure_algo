package com.data.structure.array;

public class BestTimeToBuyAndSellStock {

//
//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    public static void main(String[] args) {

        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        int n = prices.length;

        for(int i=0;i<n;i++){

            if(prices[i]<lsf)
                lsf = prices[i];

            pist = prices[i] - lsf;
            if(op<pist)
                op = pist;

        }
        return op;
    }
}
