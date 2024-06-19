package com.leetcode_150.arrays_and_hashing.easy.is_anagram;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    // my solution using hashmap
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length())
    //         return false;

    //     Map<Character, Integer> charMap = new HashMap<>();

    //     for (int i = 0; i < s.length(); i++) {
    //         if (charMap.get(s.charAt(i)) == null) {
    //             charMap.put(s.charAt(i), 1);
    //         } else {
    //             int count = charMap.get(s.charAt(i));
    //             charMap.put(s.charAt(i), count + 1);
    //         }

    //     }

    //     for (int i = 0; i < t.length(); i++) {
    //         if (charMap.get(t.charAt(i)) != null) {
    //             int count = charMap.get(t.charAt(i));
    //             charMap.put(t.charAt(i), count - 1);
    //         }
    //     }

    //     for (Integer count : charMap.values()) {
    //         if (count != 0)
    //             return false;
    //     }
    //     return true;
    // }

    // same idea simpler implementation without hashmap
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "bbcc";
        String t = "ccbc";

        System.out.println(new IsAnagram().isAnagram(s, t));
    }
}
