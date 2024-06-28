package com.leetcode_150.stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        if(s.length() < 2)
            return false;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')')
            {
                if(!stack.isEmpty() && stack.pop() == '(')  continue;
                else return false;
            }

            else if (s.charAt(i) == '}')
            {
                if(!stack.isEmpty() && stack.pop() == '{')  continue;
                else return false;
            }

            else if (s.charAt(i) == ']')
            {
                if(!stack.isEmpty() && stack.pop() == '[')  continue;
                else return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        
    }
}
