package com.masanta.ratan.leetcode.medium;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		System.out.println(longestCommonSubsequence("abc","cab"));
		
	}
	
	public static int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();
        int dp[][]=new int[len1+1][len2+1];
        int i=0;
        int j=0;
        for(i=0;i<text1.length();i++)
        {
            for(j=0;j<text2.length();j++)
            {
                if(text1.charAt(i)==text2.charAt(j))
                {
                    dp[i+1][j+1]=1+dp[i][j];
                }
                else
                {
                dp[i+1][j+1]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[i][j];
    }
	

}
