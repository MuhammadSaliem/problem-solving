package com.leetcode_150.arrays_and_hashing.easy;

public class RomanToInteger {

    // first solution from left to right
    // public int romanToInt(String s) {

    // int sum = 0;
    // int value = -1;

    // for (int i = 0; i < s.length(); i++) {

    // if((s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') && i <
    // s.length() - 1)
    // {
    // value = mapToSubInt(s.substring(i, i + 2));
    // if (value != -1)
    // {
    // sum += value;
    // i++;
    // continue;
    // }

    // }
    // sum += mapToInt(s.charAt(i));
    // }

    // return sum;
    // }

    // second solution from right to left
    public int romanToInt(String s) {

        int largest = mapToInt(s.charAt(s.length() - 1));
        int sum = largest;
        int value = -1;

        for (int i = s.length() - 2; i >= 0; i--) {
            value = mapToInt(s.charAt(i));
            if (value >= largest) {
                sum += value;
                largest = value;
            } else
                sum -= value;

        }

        return sum;
    }

    private int mapToInt(char letter) {
        if (letter == 'I')
            return 1;

        if (letter == 'V')
            return 5;

        if (letter == 'X')
            return 10;

        if (letter == 'L')
            return 50;

        if (letter == 'C')
            return 100;

        if (letter == 'D')
            return 500;

        if (letter == 'M')
            return 1000;

        return -1;
    }

    private int mapToSubInt(String letter) {
        if (letter.equals("IV"))
            return 4;

        if (letter.equals("IX"))
            return 9;

        if (letter.equals("XL"))
            return 40;

        if (letter.equals("XC"))
            return 90;

        if (letter.equals("CD"))
            return 400;

        if (letter.equals("CM"))
            return 900;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
