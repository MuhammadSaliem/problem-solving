package com.leetcode_150.arrays_and_hashing.easy.duplicate_integer;

import java.util.HashSet;

public class DuplicateInteger {

    // using sort
    // public boolean hasDuplicate(int[] nums) {

    // if (nums.length <= 1)
    // return false;

    // Arrays.sort(nums);

    // for (int i = 0; i < nums.length - 1; i++) {
    // if (nums[i] == nums[i + 1])
    // return true;
    // }

    // return false;
    // }

    // using hashset
    public boolean hasDuplicate(int[] nums) {

        if (nums.length <= 1)
            return false;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;

            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3 };
        System.out.println(new DuplicateInteger().hasDuplicate(arr));
    }
}
