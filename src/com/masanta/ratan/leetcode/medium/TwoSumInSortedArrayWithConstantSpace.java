package com.masanta.ratan.leetcode.medium;

public class TwoSumInSortedArrayWithConstantSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	/*
	 * 
	 * This approach is O(n^2), time limit exceeds for this one
	 * Brute Force algorithm
	 * 
	 */
	public static int[] twoSumUsingForLoops(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1 ; i++){
            for(int j = i+1; j < numbers.length ; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return null;
    }

	/*
	 * 
	 * Optimized solution
	 * As it's a sorted array, we are adding the start and end pointers and then changing 
	 * the values as required and checking the sum value in comparison to target
	 * 
	 */
	 public static int[] twoSum(int[] numbers, int target) {
	        int start=0, end = numbers.length-1;
	    
	    while ( start <= end){
	        
	        int sum = numbers[start] + numbers[end];
	        
	        if ( target == sum){
	            return new int[]{start+1, end+1};
	        }
	        if(sum < target){
	        start ++;
	        } else{
	        end--; 
	        }
	        

	    }
	    
	    return new int[]{};
	    }
	 
	 
}
