package com.masanta.ratan.leetcode.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
	}
	
	 public static String longestCommonPrefix(String[] strs) {
	        int n = strs.length;
	        String pre = strs[0];
	        for (int i = 1; i<n; i++) {
	            while (!strs[i].startsWith(pre)) {
	                pre = pre.substring(0,pre.length()-1);
	                if (pre == "") return "";
	            }
	        }
	        return pre;
	    }

}
