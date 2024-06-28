package com.leetcode_150.arrays_and_hashing.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--)
        {
            if(s.charAt(i) == ' ' && count > 0)
                break;

            if(s.charAt(i) == ' ')
                continue;
            
            count++;
            
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
