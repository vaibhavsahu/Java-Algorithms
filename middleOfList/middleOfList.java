//Find the Middle of a List in a Single Pass

public ListNode findMiddleNode(ListNode head) {

    if(head == null){
        return null;
    } else if(head.next == null){
        return head;
    } else {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
            //System.out.print();
        }
        System.out.println(len);
        //if len is even return mid else return mid + 1
        int mid = 0;
        if(len % 2 == 0){
            mid = len / 2 - 1;
        }else{
            mid = len / 2;
        }
        ListNode t = head;
        for(int i = 0; i < mid; i++){
            t = t.next;
        }
        return t;
    }
}