package com.vaibhav.amazon;

import java.util.*;

public class Main {
    /*
    number of test cases ->  2
    5 5 3 -> 1
    11 6 4 -> 1
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //number of test cases
        int num_of_test_cases = sc.nextInt();
        //System.out.println(num_of_test_cases);

        //run a for loop for number of test cases times
        for (int i = 0; i < num_of_test_cases; i++) {
            //number of elements in array
            int m = sc.nextInt(); //decimal number
            int k = sc.nextInt(); //kth char
            int n = sc.nextInt(); //number of iterations
            String str = Integer.toBinaryString(m);
            //System.out.println(str.toString());
            StringBuilder sb1 = new StringBuilder();
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder(); //at every iteration, the length of sb would double
                for (int l = 0; l < str.length(); l++) {
                    if(str.charAt(l) == '0'){
                        sb.append("01");
                    } else {
                        sb.append("10");
                    }
                }
                //System.out.println(sb.toString());
                str = sb.toString();
                System.out.println(str);
            }

            //find kth char
            System.out.println(str.charAt(k));

        }
    }
}