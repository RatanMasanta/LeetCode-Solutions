package com.masanta.ratan.leetcode.medium;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[] {1,2,3,5,1,4}));

	}

	/*
	    suppose the array is
			
		index: 0 1 2 3 4 5
		
		value: 2 5 1 1 4 3
		
		first subtract 1 from each element in the array, so it is much easy to understand.
		use the value as pointer. the array becomes:
		
		index: 0 1 2 3 4 5
		
		value: 1 4 0 0 3 2
		
		
		
		Second if the array is
		
		index: 0 1 2 3 4 5
		
		value: 0 1 2 4 2 3
		
		we must choose the last element as the head of the linked list. If we choose 0, we can not detect the cycle.
		
		Now the problem is the same as find the cycle in linkedlist!
		
		One condition is we cannot modify the array. So the solution is

	 */
	public static int findDuplicate(int[] nums) {
	/*
		int n = nums.length;
		int slow = n;
		int fast = n;
		do{
		    slow = nums[slow-1];
		    fast = nums[nums[fast-1]-1];
		}while(slow != fast);
		slow = n;
		while(slow != fast){
		    slow = nums[slow-1];
		    fast = nums[fast-1];
		}
		return slow;
	*/
		
		/*
		 * Much faster solution:
		 * Define a boolean array of length equals to that of array.
		 * Check if the index has a true value or not, if yes, return the value, else populate the value to true.
		 * This way when we will get the duplicate, it'll return true and we'll know what was the solution
		 */
		
		boolean []boo = new boolean[nums.length];

		for(int i=0;i<nums.length;i++){
			if(boo[nums[i]]){
				return nums[i];
			}
			boo[nums[i]]=true;
		}
		return -1;
	}

}
