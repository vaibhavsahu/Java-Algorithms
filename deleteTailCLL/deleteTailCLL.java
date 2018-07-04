//Given a circular-linked list, write a function to delete its tail node and return the modified list's head. *x = indicates head node
//1->2->3->4->*1 ==> 1->2->3->*1 


public ListNode deleteAtTail(ListNode head) {
    if(head == null){
        return null;
    }
    
    if(head.next == head){
        head = null;
        return null;
    }

    ListNode temp = head;
    ListNode t = null;
    while(temp.next != head){
        t = temp;
        temp = temp.next;
    }
    
    temp = null;
    t.next = head;
        
    return head;
}