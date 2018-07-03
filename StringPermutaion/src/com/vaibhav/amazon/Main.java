package com.vaibhav.amazon;

import java.util.Arrays;

public class Main {

    public static boolean isPermutation(String str1, String str2){
        char [] charArr1 = str1.toCharArray();
        char [] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        //System.out.println(String.valueOf(charArr1));
       // System.out.println(String.valueOf(charArr2));

        if(String.valueOf(charArr1).equals(String.valueOf(charArr2))){
            return true;
        }


        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "bca"));
    }
}
