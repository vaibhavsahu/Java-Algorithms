package com.vaibhav.interview;

public class Main {

    public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.head = new LinkedList.LinkedListNode(10);
	list.head.next = new LinkedList.LinkedListNode(20);
	list.head.next.next = new LinkedList.LinkedListNode(40);
	list.head.next.next.next = new LinkedList.LinkedListNode(10);
		
	list.removeDups(list.head);
	list.printList();
    }
}
