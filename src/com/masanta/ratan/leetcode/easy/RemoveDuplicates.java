package com.masanta.ratan.leetcode.easy;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		System.out.println(removeDuplicates(new int[] {1,1,2,2,3,4,4,6,8}));
		
	}
	
	public static int removeDuplicates(int[] nums) {
        int arrayLength = nums.length;
        if(arrayLength == 0 || arrayLength == 1){
            return arrayLength;
        }
        int j = 0;
        for(int i=0;i<arrayLength - 1;i++){
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[arrayLength - 1];
        return j;
    }

}
