package com.leetcode_150.arrays_and_hashing.medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    // public int removeDuplicates(int[] nums) {

    //     if (nums.length == 1)
    //         return 1;

    //     int i = 0;
    //     int k = 1;
    //     int steps = 1;
    //     while (k < nums.length) {

    //         if ((k == nums.length - 1 && steps < 2) || nums[k] != nums[i]) {

    //             nums[++i] = nums[k++];
    //             steps = 1;
    //         }

    //         else if (nums[k] == nums[i]) {
    //             k++;
    //             if (steps < 2) {
    //                 nums[++i] = nums[i - 1];
    //                 steps++;
    //             }
    //         }

    //     }
    //     return i + 1;

    // }

    // Another solution from leetcode comments 
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int left = 2;
        for (int right = 2; right < nums.length; right++) {
            if (nums[right] != nums[left - 2]) {
                nums[left++] = nums[right];
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 2, 3, 4, 4, 4 };
        // int[] arr = { 1, 1, 1 };

        System.out.println("k -> " + new RemoveDuplicatesFromSortedArrayII()
                .removeDuplicates(arr));

        Arrays.stream(arr).forEach(x -> System.out.print(x + ", "));
    }
}
