package com.leetcode_150.arrays_and_hashing.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0)
            return 0;

        int i = 0;
        int k = nums.length - 1;
        
        while (i <= k) {

            if (nums[i] == val)
                nums[i] = -1;

            if (nums[k] == val)
                nums[k--] = -1;

            if (nums[i] == -1) {
                nums[i] = nums[k];
                nums[k--] = -1;
            } 
            else
                i++;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        System.out.println(new RemoveElement().removeElement(nums, val));
    }
}
