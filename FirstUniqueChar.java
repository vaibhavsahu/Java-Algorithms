package com.vaibhav.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static int uniqueCharIndex(String str){
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        
        for(int i =0; i < str.length(); i++){
            if(charMap.containsKey(str.charAt(i))){
                charMap.put(str.charAt(i), charMap.get(str.charAt(i))+1);
            }else{
                charMap.put(str.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: charMap.entrySet()){
            char c = entry.getKey();
            int value = entry.getValue();
            if(value == 1){
                return str.indexOf(c);
            }
        }
//        Iterator it = charMap.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry)it.next();
//            System.out.println(pair.getKey() + " = " + pair.getValue());
//            it.remove(); // avoids a ConcurrentModificationException
//        }
        //charMap.forEach((k, v) -> System.out.println(k+" : "+v));
        
        return 0;
    }
    
    public static void main(String[] args) {
	String str = "loveleetcode";

        System.out.println(uniqueCharIndex(str));
    }
}
