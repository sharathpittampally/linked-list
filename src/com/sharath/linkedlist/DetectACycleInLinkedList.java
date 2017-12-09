package com.sharath.linkedlist;

import com.sharath.linkedlist.model.LinkedList;
import com.sharath.linkedlist.model.Node;

public class DetectACycleInLinkedList {
	
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		Node head = ll.createALLWithCycle();
		System.out.println("Is there a cycle: "+detectCycle(head));
		Node head2 = ll.createASampleLL();
		System.out.println("Is there a cycle: "+detectCycle(head2));
	}
	private static boolean detectCycle(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				return true;
			}		
		}
		return false;
	}
}
