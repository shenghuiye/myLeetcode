package com.syh.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

//杨辉三角
public class Generate {
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0){
            return triangle;
        }
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        for (int i = 1;i < numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevRow = triangle.get(i-1);
            row.add(1);
            for (int j = 1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }

    public List<Integer> getRow(int numIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        for (int i=0;i<=numIndex;i++){
            List<Integer> cur = new ArrayList<Integer>();
            for (int j =0;j<= i;j++){
                if (j==0 || j==i){
                    cur.add(1);
                }else{
                    cur.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev = cur;
        }
        return prev;
    }
    public static void main(String[] args) {
        Generate generate = new Generate();
        List<List<Integer>> res =  generate.generate1(5);
        System.out.println(res);
        System.out.println(res.get(4));
        List<Integer> res1 = generate.getRow(3);
        System.out.println(res1);
    }
}
