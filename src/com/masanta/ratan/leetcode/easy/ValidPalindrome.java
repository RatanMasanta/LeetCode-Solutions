package com.masanta.ratan.leetcode.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}
	
	public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
       for (int i = 0, j = c.length - 1; i < j; ) {
           if (!Character.isLetterOrDigit(c[i])) i++;
           else if (!Character.isLetterOrDigit(c[j])) j--;
           else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 
               return false;
       }
       return true;
	}

}
