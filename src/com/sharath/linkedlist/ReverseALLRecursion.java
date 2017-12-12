package com.sharath.linkedlist;

import com.sharath.linkedlist.model.LinkedList;
import com.sharath.linkedlist.model.Node;

public class ReverseALLRecursion 
{
	static Node revListHead = null;
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		reverse(ll.createASampleLL());
		ll.print(revListHead);
	}
	
	private static Node reverse(Node head)
	{
		if(head.next == null)
		{
			revListHead = head;
			return head;
		}
		
		Node future = reverse(head.next);
		future.next = head;
		head.next = null;
		return head;
	}
}
