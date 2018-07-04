//Given the head pointer of a singly linked list, implement a method to reverse the list and return the new head. 

public ListNode reverseList(ListNode head) {    
    if(head == null){
        return null;
    } else if(head.next == null) {
        return head;
    } else {
            ListNode temp = head;
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null) {
                ListNode temp1 = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp1;
            }
        head = prev;
    }
    return head;
}