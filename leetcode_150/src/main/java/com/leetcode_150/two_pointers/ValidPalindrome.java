package com.leetcode_150.two_pointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        
        if(s.length() == 1)
            return true;

        for(int i = 0, k = s.length() - 1; i < k;)
        {
            if(!isAlphaNumeric(s.charAt(i)))    
                i++;

            else if(!isAlphaNumeric(s.charAt(k)))
                k--;

            else if(!isEqual(s.charAt(i), s.charAt(k)))
                return false;
            
            else 
            {
                i++;
                k--;
            }               
        }

        return true;
    }

    private boolean isAlphaNumeric(char c)
    {
        return (c >= 48 && c <= 57)
        || (c >= 65 && c <= 90)
        || (c >= 97 && c <= 122);
    }

    private boolean isEqual(char c1, char c2)
    {
        if(c1 >= 65 && c1 <= 90)
            c1 += 32;
        
        if(c2 >= 65 && c2 <= 90)
            c2 += 32;

        return c1 == c2;
    }

    public static void main(String[] args) {
        String text = "aa";
        System.out.println(new ValidPalindrome().isPalindrome(text));
    }
}
