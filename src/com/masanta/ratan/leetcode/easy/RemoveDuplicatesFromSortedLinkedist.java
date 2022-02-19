package com.masanta.ratan.leetcode.easy;

public class RemoveDuplicatesFromSortedLinkedist {


	private static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		
		deleteDuplicates(head);
		
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
		
		System.out.println("Done");
	}


	public static ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		while(temp!=null && temp.next!=null )    
		{
			if(temp.val==temp.next.val)
				temp.next=temp.next.next;
			else
				temp=temp.next;
		}
		return head;
	}
	
	
	/*This method seems more faster*/
	//The appraoch is , we first go at the end and then while returning , if the values of two 
	//consecutive nodes is same then we return the reference of next node else return the 
	//node of that particular node 
	private static ListNode deleteDuplicatesUsingRecursion(ListNode head) {
		if(head==null || head.next==null)
            return head;
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val)
            return head.next;
        else
            return head;
	}
}
