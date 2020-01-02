package com.syh.leetcode.simple;

public class LengthOfLastWord {
    public int lengthOfLastWord1(String s) {
        s=s.trim();
        int len = s.length();
        if(len == 0){
            return 0;
        }
        if (!s.contains(" ")){
            return len;
        }
        int j=0;
        for(int i = 0;i < len;i++){
            if (s.charAt(i)==' '){
                j=i;
            }
        }

        return len - j - 1;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int l = lengthOfLastWord.lengthOfLastWord1(" c v vv v ");
        System.out.println(l);
    }
}
