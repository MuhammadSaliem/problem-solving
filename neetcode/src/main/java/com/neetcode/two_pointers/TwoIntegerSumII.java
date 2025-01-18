// Two Integer Sum II
// https://neetcode.io/problems/two-integer-sum-ii

package com.neetcode.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSumII {

    // Two Pointers solution O(n)
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[] { start + 1, end + 1 }; // Return 1-based indices
            }

            if (sum > target) {
                end--; // Decrease the end pointer
            } else {
                start++; // Increase the start pointer
            }
        }

        return new int[0]; // Return an empty array if no solution exists
    }

    // Hashmap Solution O(n)
    /*
    public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (mp.containsKey(tmp)) {
                return new int[] { mp.get(tmp), i + 1 };
            }
            mp.put(numbers[i], i + 1);
        }
        return new int[0];
    }
    */
}

    public static void main(String[] args) {
        int[] result = new TwoIntegerSumII().twoSum(new int[] { 1, 2, 3, 4 }, 3);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
