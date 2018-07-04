/*
Given a singly-linked list, implement a method to check if the list has cycles.
The space complexity can be O(n).
If there is a cycle, return true otherwise return false.
Empty lists should be considered non-cyclic. 
*/

public Boolean isCyclic(ListNode head) {
    
if(head == null){
    return false;
	}else if(head.next == null){
    	return false;
	}else{
	    HashSet<ListNode> set = new HashSet<ListNode>();
	    ListNode temp = head;
	    while(temp != null){
	    	if(set.contains(temp)){
	        	return true;
	    	}else{
	        	set.add(temp);
	        	temp = temp.next;
	    	}
	    }   
}
return false;
}