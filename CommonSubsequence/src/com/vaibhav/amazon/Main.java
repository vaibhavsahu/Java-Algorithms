package com.vaibhav.amazon;

import java.util.Scanner;

public class Main {

    public static int LCS(char [] arr1, char [] arr2, int m, int n){
        if(m == 0 || n == 0) //either of char arrays are empty
            return 0;
        if(arr1[m-1] == arr2[n-1]){ //if last character matches, call LCS function recursively to remaining arrays
            return 1 + LCS(arr1, arr2, m-1, n-1);
        }else{
            return Math.max(LCS(arr1, arr2, m, n-1), LCS(arr1, arr2, m-1, n));
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num_of_testCases = sc.nextInt();

        for (int i = 0; i < num_of_testCases; i++) {

            //collect two input strings a and b
            String one = sc.next();
            String two = sc.next();

            char [] arr1 = one.toCharArray();
            char [] arr2 = two.toCharArray();
            int m = arr1.length;
            int n = arr2.length;

            int l = LCS(arr1, arr2, m , n);
            if(l > 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }

        }
    }
}
