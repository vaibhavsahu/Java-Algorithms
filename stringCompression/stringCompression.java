/*
Compress a sorted String by replacing instances of repeated characters with the character followed by the count of the character.


compressString("aaabbbbbcccc") --> a3b5c4
compressString("aabbbbccc") --> a2b4c3
compressString("abc") --> abc

*/


package com.vaibhav.interview;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static String Compress(String str){

        //Hashmap

        char [] array = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < array.length; i++){
            if(charMap.containsKey(array[i])){
                charMap.put(array[i], charMap.get(array[i])+1);
            }else{
                charMap.put(array[i], 1);
            }
        }

        charMap.forEach((k, v) -> {
            sb.append(k);
            sb.append(v);
        });


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Compress("AAAABBBCCCD"));
    }
}
