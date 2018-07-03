package com.vaibhav.amazon;

import java.util.*;

public class Main {
    /*
One order can be recieved by either one. If rahul receives ith order, then ankit will not recieve the same order.
    number of test cases ->  2
5 3 3 N X Y, X + Y >= 5
1 2 3 4 5 Rahuls' Order
5 4 3 2 1 Ankit's Order
8 4 4 N X Y, X + Y >= N
1 4 3 2 7 5 9 6 Rahul's Order
1 2 3 6 5 4 9 8 Ankit's Order
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //number of test cases
        int num_of_test_cases = sc.nextInt();
        //System.out.println(num_of_test_cases);

        //run a for loop for number of test cases times
        for (int i = 0; i < num_of_test_cases; i++) {
            //number of elements in array
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();


            int[] arr_rahul_orders = new int[N];
            int[] arr_ankit_orders = new int[N];

            for (int j = 0; j < N; j++) {
                arr_rahul_orders[j] = sc.nextInt();
            }

            for (int k = 0; k < N; k++) {
                arr_ankit_orders[k] = sc.nextInt();
            }


            int total_tip = 0;
            for (int l = 0; l < N; l++) {
                    total_tip += Math.max(arr_rahul_orders[l], arr_ankit_orders[l]);
            }
            System.out.println(total_tip);
        }
    }
}