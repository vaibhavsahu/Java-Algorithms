package com.vaibhav.amazon;

import java.util.*;

public class Main {
    /*
    *
    *
    number of test cases ->  2
    number of elements in an array1 -> 6
    1 -3 2 3 6 -1
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //number of test cases
        int num_of_test_cases = sc.nextInt();
        //System.out.println(num_of_test_cases);

        //run a for loop for number of test cases times
        for (int i = 0; i < num_of_test_cases; i++) {
            //number of elements in array
            int num_of_inputs = sc.nextInt();
            //create an HashSet from inputs
            int[] arr = new int[num_of_inputs];

            for (int k = 0; k < num_of_inputs; k++) {
                arr[k] = sc.nextInt();
            }

            HashSet<Integer> set = new HashSet<Integer>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < num_of_inputs ; j++) {
                    if(set.add(Math.abs(arr[j]))){
                        continue;
            } else{
                        list.add(Math.abs(arr[j]));
                    }
            }
            Collections.sort(list);
            if(list.isEmpty()){
                System.out.println(0);
            } else{
                for (Integer num : list) {
                    System.out.print(-num + " " + num + " ");
                }
                System.out.println();
            }
        }
    }
}