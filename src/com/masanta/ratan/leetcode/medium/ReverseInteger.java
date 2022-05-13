package com.masanta.ratan.leetcode.medium;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse2(-321));
		System.out.println(reverse(-165));

	}

	public static int reverse2(int x) {
		

		int result = 0;

		while (x != 0) {
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if ((newResult - tail) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}

		return result;
	}

	
	public static int reverse(int n) {
		return helper(n, 0);
	}

	private static int helper(int num1, int num2) {
		if (num1 == 0) {
			return num2;
		}
		if ((Integer.MAX_VALUE / 10) < num2 || (Integer.MIN_VALUE / 10) > num2) {
			return 0;
		}
		return helper(num1 / 10, num2 * 10 + num1 % 10);
	}

}
