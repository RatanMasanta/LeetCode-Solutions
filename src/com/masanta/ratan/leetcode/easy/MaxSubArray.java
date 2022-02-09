package com.masanta.ratan.leetcode.easy;

public class MaxSubArray {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {}));

	}
	
	public static int maxSubArray(int[] nums) {
        int sum = 0;
        int lengthOfArray = nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<lengthOfArray;i++)
        {
            sum=sum+nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0)
            {
                sum=0;
            }
           
        }
        return maxi;
    }

}
