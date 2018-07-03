package com.vaibhav.amazon;

public class Main {

    public static String replace(String a, String b){
        if(a.isEmpty() || b.isEmpty()){
            return a;
        }

        int whitespaceCount = 0;

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' '){
                whitespaceCount++;
            }
        }

        int updatedLength = a.length() - whitespaceCount + whitespaceCount * b.length() - 1;
        //System.out.println(updatedLength);
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;

        StringBuffer result = new StringBuffer("");

        for (int i = 0; i <= lenA; i++) {
            if(a.charAt(i) != ' '){
                result.append(a.charAt(i));
                continue;
            }else{
                for (int j = 0; j <= lenB; j++) {
                    result.append(b.charAt(j));
                }
            }
        }

        return result.toString();

    }


    public static void main(String[] args) {
        System.out.println(replace("abc abc abc", "de"));
    }
}
