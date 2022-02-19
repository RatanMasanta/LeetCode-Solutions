package com.masanta.ratan.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeInOrderTraversal {


	// Definition for a binary tree node. 
	private static class TreeNode { 
		int val; 
		TreeNode left; 
		TreeNode right; 
		
		TreeNode() {} 
		
		TreeNode(int val) { 
			this.val = val;
		}
		
		TreeNode(int val, TreeNode left, TreeNode right) { 
			this.val = val; 
			this.left = left;
			this.right = right; 
		} 
		
	}


	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		List<Integer> inOrderTraversalList = inorderTraversal(root);
		for(Integer i: inOrderTraversalList)
			System.out.print(i + " ");

	}

	public static List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		recInorder(root, list);

		return list;
	}

	public static void recInorder(TreeNode node, List<Integer> list) {

		if (node == null)
			return;

		recInorder(node.left, list);
		list.add(node.val);
		recInorder(node.right, list);

	}

}
