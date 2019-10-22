package com.syh.leetcode.simple;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。
示例 1:
输入: "()"
输出: true
示例 2:
输入: "()[]{}"
输出: true
示例 3:
输入: "(]"
输出: false
* */
public class IsValid {
    private Map<Character,Character> map = new HashMap<Character, Character>();
    private LinkedList<Character> list = new LinkedList<Character>();
    public IsValid(){
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        map.put('?','?');
        list.add('?');
    }

    public boolean isValid1(String s) {
        if(s.length()>0 && !map.containsKey(s.charAt(0))){
            return false;
        }
        for(Character c : s.toCharArray()){
            if (map.containsKey(c)){
                list.addLast(c);
            }else if (map.get(list.removeLast())!=c){
                    return false;
                }
        }
        return list.size()==1;
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid1("()[(]}"));
    }
}
