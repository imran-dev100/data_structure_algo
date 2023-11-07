package com.technique.operations.binary;

public class CountingBits {
//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
	
  public static void main(String[] args) {
	int[] arr  = countBits(5);
	  for(int i:arr)
		System.out.print(i+" ");
  }

  public int[] countBits(int n) {
        
        int[] ans = new int[n+1];

        for (int i = 1; i <= n; ++i)
            ans[i] = ans[i / 2] + (i % 2 == 0 ? 0 : 1);

        return ans;
  }
}
