package com.data.structure.array;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

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
                    break;
                }
        return result;
    }

}
