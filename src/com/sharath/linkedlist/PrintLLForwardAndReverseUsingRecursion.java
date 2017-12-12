package com.sharath.linkedlist;

import com.sharath.linkedlist.model.LinkedList;
import com.sharath.linkedlist.model.Node;

public class PrintLLForwardAndReverseUsingRecursion {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		printForward(ll.createASampleLL());
		System.out.println();
		printReverse(ll.createASampleLL());
	}
	
	private static void printForward(Node head)
	{
		System.out.print(head.data);
		if(head.next == null)
			return;
		printForward(head.next);
	}
	
	private static void printReverse(Node head)
	{
		if(head == null)
			return;
		printReverse(head.next);
		System.out.print(head.data);
	}
}
