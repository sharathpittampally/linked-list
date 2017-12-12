package com.sharath.linkedlist.model;

public class LinkedList 
{
	Node head = null;
	
	public void add(int data)
	{
		if(head == null)
		{
			Node n = new Node(data);
			head = n;
		}
		else
		{
			Node t = head;
			while(t.next != null)
			{
				t = t.next;
			}
			Node n = new Node(data);
			t.next = n;
		}
	}
	
	public Node createASampleLL()
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		head = n1;
		return head;
	}
	
	public Node createALLWithCycle()
	{
			Node n1 = new Node(1);
			Node n2 = new Node(2);
			Node n3 = new Node(3);
			Node n4 = new Node(4);
			Node n5 = new Node(5);
			Node n6 = new Node(6);
			Node n7 = new Node(7);
			Node n8 = new Node(8);
			
			n1.next = n2;
			n2.next = n3;
			n3.next = n4;
			n4.next = n5;
			n5.next = n6;
			n6.next = n7;
			n7.next = n8;
			n8.next = n4;
			
			head = n1;
			return head;
	}
	
	public void print(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data);
			head = head.next;
		}
	}
}
