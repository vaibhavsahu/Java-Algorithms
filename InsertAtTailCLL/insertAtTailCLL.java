//Given a circular linked list, write a method to insert a node at its tail. Return the list's head.

public ListNode insertAtTail(ListNode head, int data) {
    
    if(head == null){
        ListNode node = new ListNode(data);
        node.next = node;
        return node;
    } else {
        ListNode temp = head;
        while(temp != head){ 
            temp = temp.next;
        }
        ListNode node = new ListNode(data);
        ListNode temp1 = temp.next;
        temp1.next = node;
        node.next = head;
        return head;
    }
}