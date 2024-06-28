package com.leetcode_150.arrays_and_hashing.easy;

// two facts to solve this problem
// 1. either all the words have the same prefix and they are sorted
// 2. none of the words have a common prefix
// those facts are not mentoined the problem statement on leetcode

// solution
// we supposed that the first word is the common prefix 
// then we continue to the next word and remove character by character form the prefix to match the word prefix
// continue till the end of the array and you will find the most common prefixs


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++)
        {
            while (strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow","flight"}));
    }
}
