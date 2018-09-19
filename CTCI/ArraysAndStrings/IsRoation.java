package com.vaibhav.interview;

public class Main {


    public static boolean isRotation(String str1, String str2){

        int len = str1.length();
        if(len == str2.length() && len > 0){
            String s1s1 = str1 + str1;
            return s1s1.contains(str2);
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";

        System.out.println(isRotation(s1, s2));

    }
}
