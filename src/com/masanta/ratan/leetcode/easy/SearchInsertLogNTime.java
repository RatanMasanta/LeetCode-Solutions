package com.masanta.ratan.leetcode.easy;

import java.util.Arrays;

public class SearchInsertLogNTime {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,2,3,4,5,6}, 4));
	}
	
	public static int searchInsert(int[] nums, int target) {
        if(Arrays.binarySearch(nums, target) < 0)
        {
            for(int i = 0; i < nums.length; ++i)
            {
                if(nums[i] > target)
                    return i;
                if(i == nums.length - 1)
                    return i+1;
            }
        }
        return Arrays.binarySearch(nums, target);
    }

}
