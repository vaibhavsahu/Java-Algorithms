package com.vaibhav.interview;

import java.util.Arrays;

public class Main {

    public static boolean AnagramTest(String str1, String str2){

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(String.valueOf(arr1).equals(String.valueOf(arr2))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "CBA";

        System.out.println(AnagramTest(str1, str2));
    }
}
