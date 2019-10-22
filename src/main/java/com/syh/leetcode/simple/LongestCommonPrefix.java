package com.syh.leetcode.simple;

import com.syh.leetcode.moderately.LongestPalindrome;

/*编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1:
输入: ["flower","flow","flight"]
输出: "fl"
示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:
所有输入只包含小写字母 a-z 。
* */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length == 0){
            return "";
        }
        String s = strs[0];
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || c != strs[j].charAt(i)){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String s = longestCommonPrefix.longestCommonPrefix(new String[]{"abc","ab","abcd"});
        System.out.println(s);
    }
}
