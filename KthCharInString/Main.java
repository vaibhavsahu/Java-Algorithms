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
        return (n % 2 == 0 ? 0 : 1) + CountSetBits(n / 2);
    }

    public static boolean checkPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
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
                if(checkPrime(n) && n > 1){
                    count_primes++;
                }
            }
            System.out.println(count_primes);
        }
    }
}