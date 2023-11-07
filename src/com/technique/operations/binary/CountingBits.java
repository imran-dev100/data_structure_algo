package com.technique.operations.binary;

public class CountingBits {

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
