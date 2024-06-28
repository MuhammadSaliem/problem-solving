package com.leetcode_150.arrays_and_hashing.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {
                        map.get(diff),
                        i
                };
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6 };
        int[] result = new TwoSum().twoSum(nums, 7);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
