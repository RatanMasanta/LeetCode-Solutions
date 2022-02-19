package com.masanta.ratan.leetcode.easy;

public class SquareRootOfAnInteger {

	public static void main(String[] args) {
		System.out.println(mySqrt(65));
	}
	
	public static int mySqrt(int x) {
        long lo=1;
        long hi=x;
        
        while(lo <= hi){
            
            long mid = lo + (hi-lo)/2;
            
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid > x){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
            
        }
        
        return (int)lo-1;
    }

}
