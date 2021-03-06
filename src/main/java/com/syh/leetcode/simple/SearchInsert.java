package com.syh.leetcode.simple;

public class SearchInsert {
    public int searchInsert1(int[] nums, int target) {
        int len = nums.length;
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[len-1]){
            return len;
        }
        for (int i=0;i<len-1;i++){
            if(nums[i]==target){
                return i;
            }
            if (target>nums[i]&&target<nums[i+1]){
                return i+1;
            }
        }
        if (target == nums[len-1]){
            return len-1;
        }
        return 0;
    }

    public int searchInsert2(int[] nums,int target){
        int len = nums.length;
        int left = 0;
        int right = len-1;
        while(left <= right){
            int mid = (left+right)>>>1;
            if(nums[mid]==target) {
                return mid;
            }else if(nums[mid]<target){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }

    public int searchInsert3(int[] nums,int target){
        for (int i=0;i<nums.length;i++){
            if (nums[i]>target){
                return i;
            }
            if (nums[i]==target){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int [] nums = {1,3,5,6};
        int res = searchInsert.searchInsert3(nums,4);
        System.out.println(res);
    }
}
