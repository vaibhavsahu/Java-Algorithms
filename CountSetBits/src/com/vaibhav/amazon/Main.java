package com.vaibhav.amazon;

public class Main {

    public static int CountBits(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){  //remember we are cumulating the set bits from 1 to n. example
            // 1 to 4 --> total number of set bits would be 1 --> 1, 2 --> 1, 3 --> 2, 4--> 1 , total --> 1 + 1 + 2 + 1 = 5
            count += CountBitsUtil(i);
        }
        return count;
    }

    public static int CountBitsUtil(int x) {
        if (x <= 0) {
            return 0;
        } else {
            return ((x % 2 == 0) ? 0 : 1 + CountBitsUtil(x / 2));
        }
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(CountBits(5));
    }
}
