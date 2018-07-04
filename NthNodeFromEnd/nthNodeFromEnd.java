//Find the Nth Node from the end without using extra memory - Linked List

public ListNode findNthNodeFromEnd(ListNode head, int n) {          
if(head ==null){
    return head;
}else{
    int len = 0;
    ListNode temp = head;
    while(temp != null){
        len++;
        temp = temp.next;
    } 
    
    if( n > len || n <= 0){
        return null;
    }
    
    ListNode temp1 = head;
    ListNode prev = null;
    
    int pos = len-n+1;
    
    while(pos > 0){
        prev =temp1;
        temp1 = temp1.next;
        pos--;
    }   
    return prev;
}    
}