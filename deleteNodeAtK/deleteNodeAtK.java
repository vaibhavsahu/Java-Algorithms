/*

Given a singly-linked list, implement a method to delete the node at a given position (starting from 1 as the head position)
and return the head of the list. Do nothing if the input position is out of range.

*/
public ListNode deleteAtMiddle(ListNode head, int position) {
     if(head == null){
         return null;
     }  
     
     //count nodes in LinkedList
     int count = 0;
     ListNode temp1 = head;
     while(temp1 != null){
         temp1 = temp1.next;
         count++;
     }
     
     if(count < position){
         return head;
     }
     
     if(head.next == null && position == 1){
         head = null;
         return null;
     } else {
         //keep track of previous
         ListNode temp = head;
         ListNode previous = null;
         if(position == 1){
             temp = head.next;
             head = null;
             return temp;
     } 
         
     for(int i = 0; i < position-1; i++){
             previous = temp;
             temp = temp.next;   
         }
         previous.next = temp.next;
         temp.next = null;
     }
     return head;
}