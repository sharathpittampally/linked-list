package com.sharath.linkedlist;

import com.sharath.linkedlist.model.LinkedList;
import com.sharath.linkedlist.model.Node;

public class DetectAndRemoveLoop 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		Node head = ll.createALLWithCycle();
		Node llWithNoCycle = detectAndRemoveLoop(head);
		System.out.println("Is there still cycle? :"+detectCycle(llWithNoCycle));
	}
	
	private static Node detectAndRemoveLoop(Node head)
	{
		Node slow = head;
		Node fast = head;
		boolean isCycle = false;
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				isCycle = true;
				break;
			}		
		}
		int cycleSize=0;
		
		
		if(isCycle)
		{
			//counting the length of loop. Slow and fast have met at a point on the loop now.
			Node temp = slow.next;
			while(temp!=slow)
			{
				cycleSize++;
				temp = temp.next;
			}
			cycleSize++;
			
			//Now putting one point at head and other at cycleSize distance from head.
			Node t = head;
		    for(int i=1;i<=cycleSize;i++)
		    {
		    	t = t.next;
		    }
		    
		    Node headPoint = head;
		    
		    while(headPoint != t)
		    {
		    	headPoint = headPoint.next;
		    	t = t.next;
		    }
		    
		    //The place where headPoint and t meet is the starting point of the cycle.
		    //Now removing the cycle.
		    t = t.next;
		    while(t.next != headPoint)
		    {
		    	t =t.next;
		    }
		    t.next = null;
		}
		return head;
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
