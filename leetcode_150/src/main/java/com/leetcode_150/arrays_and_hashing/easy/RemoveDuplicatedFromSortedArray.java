package com.leetcode_150.arrays_and_hashing.easy;

public class RemoveDuplicatedFromSortedArray {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 1)
            return 1;

        int i = 0;
        int k = 1;
        while(k < nums.length)
        {
            if(nums[k] == nums[i])
                k++;

            else if(nums[k] != nums[i])
                nums[++i] = nums[k++];
        }
        return k;
    }

    public static void main(String[] args) {
        
    }
}
