package com.masanta.ratan.leetcode.easy;


public class CheckIfSameTree {

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

		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		
		System.out.println(isSameTree(root1, root2));

	}
	
	/*
	 * Recursion being called to match individual children of both the roots
	 * 
	 */
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        boolean result = p.val == q.val;
        result &= isSameTree(p.left, q.left);
        result &= isSameTree(p.right, q.right);
        return result;
    }



}
