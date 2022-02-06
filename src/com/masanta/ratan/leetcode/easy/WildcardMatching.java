package com.masanta.ratan.leetcode.easy;

public class WildcardMatching {

	public static void main(String[] args) {
		
		System.out.println(isMatch("cb","?b"));
		
	}
	
	public static boolean isMatch(String text, String pattern){
        
        int p = pattern.length();
        int t = text.length();
        boolean[][] dp = new boolean[p + 1][t + 1];
        dp[p][t] = true;

        for (int i = p - 1; i >= 0; i--)
            if (pattern.charAt(i) == '*')
                dp[i][t] = dp[i + 1][t];

        for (int i = p - 1; i >= 0; i--)
            for (int j = t - 1; j >= 0; j--)
                if (pattern.charAt(i) == '?' || pattern.charAt(i) == text.charAt(j))
                    dp[i][j] = dp[i + 1][j + 1];
                else if (pattern.charAt(i) == '*')
                    dp[i][j] = dp[i + 1][j] || dp[i][j + 1];

        return dp[0][0];
    }

}
