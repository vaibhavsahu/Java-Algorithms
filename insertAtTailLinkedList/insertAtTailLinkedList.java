//Write a method to insert a node at the end of a singly-linked list. Return the head of the modified list. 


public ListNode insertAtTail(ListNode head, int data) {
    
//if list is empty
    if(head == null){
        //create new node and mark it as head.
        ListNode temp = new ListNode(data);
        temp.next = null;
        head = temp;
        return head;
     } else if(head.next == null) {
         ListNode temp = new ListNode(data);
         temp.next = null;
         head.next = temp;
         return head;
     } else {
         ListNode temp = head;
         while(temp.next != null){
             temp = temp.next;
         }
         ListNode newNode = new ListNode(data);
         newNode.next = null;
         temp.next = newNode;
         return head;
     }
}