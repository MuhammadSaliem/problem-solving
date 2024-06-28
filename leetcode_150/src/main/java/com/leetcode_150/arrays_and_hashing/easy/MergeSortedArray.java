package com.leetcode_150.arrays_and_hashing.easy;


/*
 * Start from rear to front
 * start from m and n positions, then compare them and add the larger one to the end of the array
 * then travarse over the arrray
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        m--;
        n--;

        for (int len = nums1.length-1; len >= 0 && n >= 0;) {
            if(m >= 0 && nums1[m] >= nums2[n])
            {
                nums1[len--] = nums1[m--];
                continue;
            }
            
            nums1[len--] = nums2[n--];
        }
       
    }

    public static void main(String[] args) {
        // int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        // int[] nums2 = new int[] { 2, 5, 6 };
        // int m = 3;
        // int n = 3;
        int[] nums1 = new int[] { 1,2,3,0,0,0 };
        int[] nums2 = new int[] { 2,5,6 };
        int m = 3;
        int n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);

        for (int i : nums1) {
            System.out.println(i);
        }
        
    }

}
