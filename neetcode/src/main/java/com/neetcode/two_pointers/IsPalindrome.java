// https://neetcode.io/problems/is-palindrome

package com.neetcode.two_pointers;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty())
            return true;

        int x = 0, y = s.length() - 1;

        while (x < y) {
            // Skip non-alphanumeric characters
            if (x < y && !isAlphanumeric(s.charAt(x)))
                x++;
            if (x < y && !isAlphanumeric(s.charAt(y)))
                y--;

            // Compare characters after converting to lowercase
            if (toLowercase(s.charAt(x)) != toLowercase(s.charAt(y)))
                return false;

            x++;
            y--;
        }

        return true;
    }

    // Convert character to lowercase without Character class
    private char toLowercase(char ch) {
        return (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
    }

    // Check if a character is alphanumeric
    private boolean isAlphanumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome("tab a cat"));
    }

}
