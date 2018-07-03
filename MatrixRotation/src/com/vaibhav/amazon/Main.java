package com.vaibhav.amazon;

import java.util.*;

public class Main {
    /*
https://www.geeksforgeeks.org/array-rotation/
This question is different where matrix needs to be rotated by 90 degree clockwise or anticlockwise.
In this problem, the array elements are shifted by one to the left
Example: [1, 2, 3, 4, 5, 6, 7]
Left rotate the array by 2
After one left rotation ->  [2, 3, 4, 5, 6, 7, 1]
After second left rotation -> [ 3, 4, 5, 6, 7, 1, 2]

This approach can be applied to matrix rotation as well, where each row is left rotated by k times


Number of test cases -> 1
M N K -> 2 2 1
Matrix Elements -> 1 2 3 4

Expected Output -> 2 1 4 3
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //number of test cases
        int num_of_test_cases = sc.nextInt();
        //System.out.println(num_of_test_cases);

        //run a for loop for number of test cases times
        for (int i = 0; i < num_of_test_cases; i++) {
            //number of elements in array
            int M = sc.nextInt(); //Number of Rows
            int N = sc.nextInt(); //Number of Cols
            int K = sc.nextInt(); //number of iterations

            int [][] arr = new int[M][N];

            //compose array based on inputs
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }


            //rotate left each row by one K times


            //print array
            for (int j = 0; j < arr.length; j++) {
                int [] temp_arr = new int[N];
                for (int k = 0; k < arr[0].length; k++) {
                    temp_arr[k] = arr[j][k];
                }
                //call row left rotation function here
            }
        }
    }
}