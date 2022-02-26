package com.masanta.ratan.leetcode.easy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("ABC"));

	}
	
	 public static int titleToNumber(String columnTitle) {
	        int ans  = 0;
	        int p  = 0;
	        for(int i = columnTitle.length() -1; i>=0; i--){
	           char c = columnTitle.charAt(i);
	           int val = (int)c - 65 + 1;
	           ans += val*Math.pow(26, p);
	            p++;
	        }
	        
	        return ans;
	    }

}
