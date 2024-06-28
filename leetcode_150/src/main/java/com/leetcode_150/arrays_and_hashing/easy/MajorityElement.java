package com.leetcode_150.arrays_and_hashing.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
            // map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int n = nums.length / 2;
        for(var set : map.entrySet())
        {
            if(set.getValue() > n)
            {
                return set.getKey();
            }
        }
        
        // return map.entrySet()
        //         .stream()
        //         .max(Map.Entry.comparingByValue())
        //         .get()
        //         .getKey();

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = { 2,2,1,1,1,2,2 };
        System.out.println(new MajorityElement().majorityElement(arr));

    }
}
