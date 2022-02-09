package com.masanta.ratan.leetcode.easy;

public class RemoveElementWithNoExtraSpace {

	public static void main(String[] args) {
		System.out.println(removeElement(new int[] {1,2,3,4,2,5,9,7,6}, 2));

	}
	
	 public static int removeElement(int[] nums, int val) {
	        int length = nums.length;
	        int j = 0;
	        for(int i=0; i< length; i++){
	            if(nums[i] != val){
	                nums[j++] = nums[i];
	            }
	        }
	        return j;
	    }

}
