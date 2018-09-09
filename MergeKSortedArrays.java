package com.vaibhav.interview;

import java.util.*;

/**
 * Created by vaibh on 9/8/2018.
 */
public class Main {

    public static void main(String [] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        List<Integer> list1 = Arrays.asList(1, 7, 16, 19);

        List<Integer> list2 = Arrays.asList(5, 6, 14, 18);

        List<Integer> list3 = Arrays.asList(2, 9, 17, 20);

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0, j = 0, k = 0; i < list1.size() || j < list2.size() || k < list3.size(); i++, k++, j++) {
            queue.add(list1.get(i));
            queue.add(list2.get(j));
            queue.add(list3.get(k));
        }
        int[] arr = new int[list1.size() + list2.size() + list3.size()];
        int m = 0;
        //Iterator<Integer> it = queue.iterator();
        while (!queue.isEmpty()) {
            arr[m] = queue.poll();
            m++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
