package com.vaibhav.amazon;

import java.util.*;

public class Main {
    /*
    number of test cases ->  2
    6 10 -> 4
    10 15 -> 5
    */
    public static int CountSetBits(int n){
        if (n <= 0)
            return 0;
        return (n % 2 == 0 ? 0 : 1) + countSetBitsUtil(n / 2);
    }

    public static boolean checkPrime(int p){
        for (int i = 2; i <= p/2; i++) {
            if((p/2) % i == 0)
                return false;
            else
                return true;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //number of test cases
        int num_of_test_cases = sc.nextInt();
        //System.out.println(num_of_test_cases);

        //run a for loop for number of test cases times
        for (int i = 0; i < num_of_test_cases; i++) {
            //number of elements in array
            int L = sc.nextInt();
            int R = sc.nextInt();

            int count_primes = 0;
            for (int j = L; j <= R; j++) {
                int n = CountSetBits(j);
                if(checkPrime(n)){
                    count_primes++;
                }
            }
        }
    }
}