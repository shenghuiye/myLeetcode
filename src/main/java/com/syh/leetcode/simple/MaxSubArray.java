package com.syh.leetcode.simple;
/*
* 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
示例:
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 0 || nums == null){
            return 0;
        }
        int [] dp = new int[len];
        dp[0] = nums[0];
        for (int i=1;i<len;i++){
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+nums[i];
            }else{
                dp[i]=nums[i];
            }
        }
        int ans = dp[0];
        for(int i=1;i<len;i++){
            if (dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;
    }
}
