package com.syh.leetcode.simple;

public class PlusOne {
    public int[] plusOne1(int[] digits) {
        int len = digits.length;
        for (int i=len-1;i>=0;i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        digits = new int [len+1] ;
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int [] a = {1,9,9};
        int [] b = {9,9,9};
        int [] c = plusOne.plusOne1(b);
        System.out.println(java.util.Arrays.toString(c));
    }
}
