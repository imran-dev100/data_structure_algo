package com.data.structure.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicate {

    public static void main(String[] args) {
        int[] ar = {1,2,3,4};

        System.out.print(containsDuplicate(ar));
    }

    private static boolean containsDuplicate(int[] ar){

        Set<Integer> set = new HashSet<>();
        for (int i:ar) {
             if(set.contains(i))
                 return true;
             set.add(i);
        }
        return false;
    }
}
