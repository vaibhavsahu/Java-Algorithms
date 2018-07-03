package com.vaibhav.amazon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    *
    *
    number of test cases ->  2
    number of elements in an array1 -> 8
    5  2  3  6  4  4  6  6
    number of elements in an array2 -> 7
    10  14  10  12  12  13  15
    */
    public static void main(String[] args) {
        //Sort the array first
        //scan the array elements, starting with the smallest element.
        //each number should differ by 0 or 1, allowing duplicates.
        //each number should only differ by 1, not allowing duplicates


        Scanner sc = new Scanner(System.in);
        //number of test cases
        int num_of_test_cases = sc.nextInt();
        System.out.println(num_of_test_cases);

        //run a for loop for number of test cases times
        for (int i = 0; i < num_of_test_cases; i++) {
            //number of elements in array
            int size_of_array = sc.nextInt();
            int[] arr = new int[size_of_array];
            //create an array from inputs
            for (int j = 0; j < size_of_array; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag = false;// = false;
            for (int k = 0; k < arr.length - 1; k++) {
                int diff = arr[k + 1] - arr[k];
                if (diff <= 1) {
                    flag = true;
                } else{
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}