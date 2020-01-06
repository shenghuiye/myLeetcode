package com.syh.leetcode.simple;

public class Merge {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m-1;
        int len2 = n-1;
        int len = m+n-1;
        while(len1>=0 && len2>=0){
            nums1[len--] = nums1[len1]<nums2[len2]?nums2[len2--]:nums1[len1--];
        }
        System.arraycopy(nums2,0,nums1,0,len2+1);
    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] a = {3,5,0,0,0};
        int[] b = {1,2,6};
        merge.merge1(a,2,b,3);
        System.out.println(java.util.Arrays.toString(a));
    }
}
