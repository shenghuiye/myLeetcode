package com.syh.leetcode.simple;

public class MaxProfit {
    public int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxP = 0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<min){
                min = prices[i];
            }else if (prices[i] - min >maxP){
                maxP = prices[i] - min;
            }
        }
        return maxP;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] a = {7,6,4,3,1};
        System.out.println(maxProfit.maxProfit1(a));
    }
}
