//Write a method to insert a node at the front of a singly-linked list and return the head of the modified list
public ListNode insertAtHead(ListNode head, int data) {
    ListNode temp = new ListNode(data);
    temp.next = head;
    head = temp;
return head;
}