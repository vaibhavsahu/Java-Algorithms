package com.vaibhav.amazon;

public class Main {

    public static String reverseString(String str){
        String inputString = str;
        String outputString = null;

        if(str == null)
            return outputString;

        if(str.isEmpty()){
            return "";
        } else if(str.length() == 1){
            return str;
        }else{
            outputString = "";
            char [] charArr = str.toCharArray();
            for (int i = charArr.length -1 ; i >= 0; i--) {
                outputString += charArr[i];
            }
            return outputString;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverseString("test"));
    }
}
