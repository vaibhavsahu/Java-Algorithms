package com.vaibhav.amazon;

/*
Input:
Number of Test Cases -> 2
Number of Elements in first array -> 6
-1 2 -3 4 -5 6
Number of Elements in first array -> 4
-3 2 -4 1

Output:
2 -1 4 -3 6 -5
2 -3 1 -4

*
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num_of_testCases = sc.nextInt();

        for (int i = 0; i < num_of_testCases; i++) {

            //number of input elements
            int size_of_array = sc.nextInt();
            int [] array_positives = new int[size_of_array/2];
            int [] array_negatives = new int[size_of_array/2];

            int k = 0;
            int m = 0;
            for (int j = 0; j < size_of_array; j++) {
                int num = sc.nextInt();
                if(num < 0){
                    array_negatives[k] = num;
                    k++;
                }else{
                    array_positives[m] = num;
                    m++;
                }
            }

            int [] array_with_positives_negatives = new int[size_of_array];
            int index = 0;
            //iterate over array_positives and array_negatives alternatively to fill a new array of size size_of_array
            for (int j = 0, l = 0;  j < m; j++, l++) {
                array_with_positives_negatives[index++] = array_positives[j];
                array_with_positives_negatives[index++] = array_negatives[l];
            }

            for (int j = 0; j < size_of_array; j++) {
                System.out.print(array_with_positives_negatives[j]+ " ");
            }
            System.out.println();
        }

    }
}
