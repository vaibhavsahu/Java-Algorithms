package com.vaibhav.amazon;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static double getMedian(int [] arr){
        //Heap to keep lower half elements, which would probably give us the max element in lower half part
        PriorityQueue<Integer> lowNumbers = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });



        return 0.0;
    }



    public static void main(String[] args) {

    }
}
