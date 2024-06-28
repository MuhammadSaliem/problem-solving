package com.leetcode_150.arrays_and_hashing.easy;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++)
        {
            if(prices[i] < buy)
                buy = prices[i];

            else if( prices[i] - buy > profit)
                profit = prices[i] - buy;
               
        }
        return profit;
    }
    

    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[] {2,4,1}));
    }
}
