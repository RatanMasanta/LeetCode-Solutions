package com.masanta.ratan.leetcode.medium;

public class PowerOfInt {

	public static void main(String[] args) {

		System.out.println(myPow(5,7));

	}

	public static double myPow(double x, int n) {
        if(n < 0){
            x = 1/x;
        }
        return func(x,n);
    }
    
    private static double func(double x, int n){
        if(n==0){
            return 1;
        }
       double ans = func(x,n/2);
        return (n%2==0 ? ans*ans : x*ans*ans);
    }
    
    public static double myPowNonRecursive(double x, int n) {
    	if(x == 1) {
            return 1;
        }
        if(x == -1) {
            return ((n & 1) == 0) ? 1 : -1;
        }
        if(n <= Integer.MIN_VALUE) {
            return 0;
        }
        double ans = 1;
        boolean neg = n < 0;
        n = Math.abs(n);
        while(n > 0) {
            int last = n & 1;
            n = n >> 1;
            if(last == 1) {
                ans *= x;
            }
            x *= x;
        }
        if(neg) {
            ans = 1 / ans;
        }
        return ans;
    }
	
}
