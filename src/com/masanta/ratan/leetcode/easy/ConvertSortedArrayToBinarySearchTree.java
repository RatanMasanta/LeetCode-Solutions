package com.masanta.ratan.leetcode.easy;

public class ConvertSortedArrayToBinarySearchTree {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		System.out.println(sortedArrayToBST(new int[] {-10,-3,0,5,9}));
	}
	
	 public static TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length == 0) {
	            return null;
	        }
	        return helper(nums,0,nums.length-1);
	    }
	    
	    public static TreeNode helper(int[] nums, int start, int end) {
	        // base case
	        if(start > end)
	            return null;
	        if(start == end)
	            return new TreeNode(nums[start]);
	        
	        
	        // Recursive case
	        int mid = start + (end-start)/2;
	        TreeNode rootNode = new TreeNode(nums[mid]);
	        rootNode.left = helper(nums,start,mid-1);
	        rootNode.right = helper(nums,mid+1,end);
	        
	        return rootNode;
	        
	    }

}
