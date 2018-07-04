//Given a singly-linked list, write a method to delete the first node of the list and return the new head. 

public ListNode deleteAtHead(ListNode head) {
      if(head == null){
          return null;
      } else if(head.next == null){
          head = null;
          return head;
      } else {
          ListNode temp = head;
          head = temp.next;
          temp = null;
          return head;
      }
}