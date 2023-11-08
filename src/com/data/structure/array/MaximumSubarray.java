package com.data.structure.array;

public class MaximumSubarray {

	/**
	 * Given an integer array nums, find the subarray with the largest sum, and
	 * return its sum.
	 * 
	 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The subarray
	 * [4,-1,2,1] has the largest sum 6.
	 * 
	 * Input: nums = [1] Output: 1 
	 * Explanation: The subarray [1] has the largest sum 1.
	 * 
	 * Input: nums = [5,4,-1,7,8] Output: 23 
	 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
	 */

	public static void main(String[] args) {
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
		
		nums = new int[]{1};
		System.out.println(maxSubArray(nums));
		
		nums = new int[]{5,4,-1,7,8};
		System.out.println(maxSubArray(nums));

	}
	
	private static int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];

		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (final int i : nums) {
			sum = Math.max(i, sum + i);
			max = Math.max(max, sum);
		}

		return max;
	}
}
