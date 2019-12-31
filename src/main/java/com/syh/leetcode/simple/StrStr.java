package com.syh.leetcode.simple;
/*实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
示例 1:
输入: haystack = "hello", needle = "ll"
输出: 2
* */
public class StrStr {
    public int strStr1(String haystack, String needle) {
        int txt = haystack.length();
        int pat = needle.length();
        for (int i=0;i<=txt-pat;i++){
            int j;
            for (j=0;j<pat;j++){
                if (needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }
            }
            if (j==pat){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        int res = strStr.strStr1("","");
        System.out.println(res);
    }
}


