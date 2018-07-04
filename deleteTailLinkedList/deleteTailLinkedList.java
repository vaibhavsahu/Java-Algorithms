//Given a singly-linked list, write a method to delete its last node and return the head. 

public ListNode deleteAtTail(ListNode head) {
       if( head == null)
            return null;
        if(head.next == null){
            head = null;
            return head;
        } else {
            ListNode t = null;
            ListNode temp = head;
            while(temp.next != null){
                t = temp;
                temp = temp.next;
            }
            t.next = null;
            return head;
        }
}