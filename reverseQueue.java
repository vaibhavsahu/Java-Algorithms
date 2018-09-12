package com.vaibhav.interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {


    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.push(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }

        queue.stream().forEach( e -> System.out.println(e));


        return queue;
    }


    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);

        Queue<Integer> equeue = reverseQueue(queue);
    }
}
