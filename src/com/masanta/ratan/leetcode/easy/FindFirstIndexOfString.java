package com.masanta.ratan.leetcode.easy;

public class FindFirstIndexOfString {

	public static void main(String[] args) {
		System.out.println(strStr("nfdnalfbadjbfldaba","daba"));

	}
	
	public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        return haystack.indexOf(needle);
    }

}
