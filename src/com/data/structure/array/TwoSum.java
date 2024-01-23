package com.data.structure.array;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
     */
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        System.out.print(twoSum(nums,9));
    }
    private static List<Integer> twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(nums[i]+nums[j]==target){
                    result.add(i);
                    result.add(j);
                    return result;
                }
        return result;
    }

}
