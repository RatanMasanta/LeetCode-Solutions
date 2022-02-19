package com.masanta.ratan.leetcode.easy;

import java.util.Scanner;

public class ClimbStairs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter number of stairs- ");  
		int  numberOfStairs = sc.nextInt();
		System.out.println(solveTD(numberOfStairs));
	}

	/*
	 * We are using Dynamic Programming approach here. Adding the number of ways to get there from back like a reverse Fibonacci
	 * Youtube tutorial:
	 * https://www.youtube.com/watch?v=Y0lT9Fck7qI
	 */


	private static int solveTD(int n) {
		if(n == 0 || n == 1) return 1;
		int pre = 1;
		int curr = pre;
		for(int i = 2; i <=n; i++) {
			int t = curr + pre;
			pre = curr;
			curr = t;
		}
		return curr;
	}

}
