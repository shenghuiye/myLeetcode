package com.syh.leetcode.moderately;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
示例 1:
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
*
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring1(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        int ans = 0;
        int length = s.length();
        for(int end = 0,start = 0;end<length;end++){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                start = Math.max(map.get(ch),start);
            }
            ans = Math.max(ans,end-start+1);
            map.put(ch,end+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring1("abcabcbb"));
    }
}
