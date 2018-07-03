package com.vaibhav.amazon;

public class Main {

    public static boolean isPalindrome(String str){
        if (str == null){
            return true;
        }
        if(str.isEmpty() ||  str.length() == 1 ){
            return true;
        }else{
            char [] charArr = str.toCharArray();
            for (int i = 0, j = charArr.length -1 ; i < charArr.length; i++, j--){
                if(charArr[i] == charArr[j]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
}
