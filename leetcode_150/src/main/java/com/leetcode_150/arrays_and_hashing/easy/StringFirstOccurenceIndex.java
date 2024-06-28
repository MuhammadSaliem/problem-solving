package com.leetcode_150.arrays_and_hashing.easy;

public class StringFirstOccurenceIndex {
    public int strStr(String haystack, String needle) {

        // if the text < keyword 
        if (haystack.length() < needle.length())
            return -1;

        // i < the text - keyword -> so that not reaching the end
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new StringFirstOccurenceIndex().strStr("hello", "ll"));
    }
}
