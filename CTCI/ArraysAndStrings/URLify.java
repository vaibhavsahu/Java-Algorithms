package com.vaibhav.interview;

public class Main {

    public static String URLify(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                sb.append("%20");
            }else if(str.charAt(i) == ' ' && str.charAt(i+1) == ' '){
                continue;
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
	String input ="Mr. John   Smith";
        System.out.println(URLify(input));
    }
}
