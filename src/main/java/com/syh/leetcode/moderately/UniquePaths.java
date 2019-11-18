package com.syh.leetcode.moderately;
/*一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
问总共有多少条不同的路径？
* */
public class UniquePaths {
    public int uniquePaths1(int m, int n) {
        int [][] dp = new int[m][n];
        for (int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }

        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=1;
        }

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        int a = uniquePaths.uniquePaths1(2,2);
        System.out.println(a);
    }
}
