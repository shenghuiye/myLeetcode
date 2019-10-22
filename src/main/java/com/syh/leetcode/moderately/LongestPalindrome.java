package com.syh.leetcode.moderately;
/*
* 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
示例 1：
输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
示例 2：
输入: "cbbd"
输出: "bb"
*/
public class LongestPalindrome {
    public boolean isPalindromic(String s){
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        int max = 0;
        String ans="";
        for(int i=0;i<len;i++){
            for (int j=i+1;j<=len;j++){
                String temp = s.substring(i,j);
                if(isPalindromic(temp) && temp.length()>max){
                    ans = temp;
                    max = Math.max(max,ans.length());
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome("cbbd"));
    }
}
