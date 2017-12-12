package com.sharath.linkedlist;

import com.sharath.linkedlist.model.LinkedList;
import com.sharath.linkedlist.model.Node;

public class ReverseLLIterative {

	public static void main(String[] args) 
	{
		final LinkedList ll = new LinkedList();
		Node head = ll.createASampleLL();
		//printing initial linked list
		Node t = head;
		while(t != null)
		{
			System.out.print(t.data);
			t=t.next;
		}
		
		//printing after reversing
		System.out.println();
		Node x = reverse(head);
		while(x!=null)
		{
			System.out.print(x.data);
			x=x.next;
		}
	}
	
	private static Node reverse(final Node head)
	{
		Node prev = null;
		Node curr = head;
		Node next = head;
		
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
