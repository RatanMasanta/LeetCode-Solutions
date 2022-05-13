package com.masanta.ratan.leetcode.medium;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		System.out.println(divide(100,7));

	}

	public static int divide(int dividend, int divisor) {
		if(dividend == Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
		boolean sign = (dividend < 0) == (divisor < 0);
		int res = div(-Math.abs(dividend), -Math.abs(divisor));
		return sign? res: -res;
	}
	
	//recursive function to check the quotient count
	public static int div(int dividend, int divisor){
		if(dividend > divisor) return 0;
		int sum = divisor, q = 1;
		while(dividend <= sum + sum && sum + sum < sum){
			sum += sum;
			q += q;
		}
		return q + div(dividend - sum, divisor);
	}


}
