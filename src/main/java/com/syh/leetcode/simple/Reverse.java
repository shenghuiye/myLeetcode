package com.syh.leetcode.simple;

import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 */

public class Reverse {
    public int reverse(int x) {
        int ans = 0;
        while(x!=0){
            int pop = x%10;
            if(ans>Integer.MAX_VALUE/10 ||( ans==Integer.MAX_VALUE/10 && pop >7 ))
            {
                return 0;
            }
            if(ans< Integer.MIN_VALUE/10 ||(ans==Integer.MIN_VALUE/10 && pop <-8)){
                return 0;
            }
            ans = ans*10+pop;
            x=x/10;
        }
        return ans;
    }

    public int reverse1(int x) {
        int ans = 0;
        int flag = 1;
        if(x<0){
            flag=0;
            x=-x;
        }
        String str = Integer.toString(x);
        int len = str.length();
        int [] nums = new int[len];
        for (int i=0;i<len;i++){
            nums[len-i-1]=(int)(str.charAt(i))-(int)'0';
            ans = ans+ (int)(nums[len-i-1]*Math.pow(10,i));
        }

        if (flag==0){
            ans=-ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(120));
    }
}
