package com.vaibhav.interview;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by vaibh on 9/19/2018.
 */
public class LinkedList {

    static LinkedListNode head;

    static class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int item){
            this.data = item;
            this.next = null;
        }
    }

    public void removeDups(LinkedListNode head){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        if(head == null){
            return;
        }else{
            LinkedListNode temp = null;
            while(head != null){
                if(set.contains(head.data)){
                    temp.next = head.next;
                }else{
                    set.add(head.data);
                    temp = head;
                }
                head = head.next;
            }
        }
    }
    public void printList(){
        LinkedListNode temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
