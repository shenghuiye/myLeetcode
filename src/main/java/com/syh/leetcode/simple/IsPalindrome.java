package com.syh.leetcode.simple;
/*判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
示例 1:
输入: 121
输出: true
示例 2:
输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数
* */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ans = 0;
        int n = 0;
        int m = x;
        while(m!=0){
            n = m % 10;
            m = m /10;
            ans = ans*10 + n;
        }
        System.out.println(ans);
        System.out.println(x);
        if(ans == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(1));
    }
}
