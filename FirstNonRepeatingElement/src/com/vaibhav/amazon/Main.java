package com.vaibhav.amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    /*
    *
    *
    number of test cases ->  4
    number of elements in an array1 -> 5
    -1 2 -1 3 2
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
            int [] arr = new int[num_of_inputs];
            int unique_num = 0;

            int non_unique_num = 0;

            int min = 0;
            HashSet<Integer> set = new HashSet<Integer>();

            for (int k = 0; k < num_of_inputs; k++) {
                arr[k] = sc.nextInt();
            }

            for (int j = 0; j < num_of_inputs; j++) {
                if(set.add(arr[j])){
                    unique_num = arr[j];
                } else{
                    non_unique_num = arr[j];
                }
                min = unique_num;
            }
            System.out.println("unique number : " + min);
        }
    }
}