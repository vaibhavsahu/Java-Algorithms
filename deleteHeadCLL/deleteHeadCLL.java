/*
Given a circular linked list, implement a method to delete its head node. Return the list's new head node.

*x = indicates head node
1->2->3->4->*1 ==> 2->3->4->*2 

*/

public ListNode deleteAtHead(ListNode head) {
                
    if(head == null){
        return null;
    }
    
    if(head.next == head){
        head = null;
        return null;
    }
    
    ListNode temp = head;
    
    ListNode t = head.next;
    
    while(temp.next != head){
        temp = temp.next;
    }
    head = null;
    temp.next = t;
return t;
    
}