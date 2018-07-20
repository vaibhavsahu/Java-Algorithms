/*Coding Challenge

     In this coding challenge you will be assessed on your ability to solve problems, the cleanliness of your code, and your testing skills.

The Challenge:  
     Using Java, write a console application that takes a string as a command line parameter, performs the calculation defined below, and writes the output to the console. 
Include the appropriate unit tests.

For example
     Given the string "gaeb7!!!8jeks5!!!tux10" return true if there are exactly 3 exclamation marks  between every pair of numbers that add up to 15. Otherwise return false.
 (Note: exclamation marks may be separated by other, non-numeric characters) 

See the examples below:
     “gaeb7!!!8jeks5!!!tux10”   => true
     “kem!7!!nej!8ww1!!!!!!5”   => true
     “7!!!8!!!7!!!8!!!7”        => true
     “5!!aaaaaaaaaaaaa!10!5”    => false
     “Aa6!9”                    => false
*/     
import java.util.regex.*;
import java.lang.*;


Class Solution{
    public static void main(String [] args){
        
        
        //supply the input from commnad line
        //program input
        String input = args[1];
        System.out.println(isValidInput(input));
        
        //unit testing
        System.out.println(isValidInput("")); //false
        System.out.println(isValidInput("test")); //false
        System.out.println(isValidInput("!!!!!!!!!3")); //false
        System.out.println(isValidInput("Aa6!9")); //false
        System.out.println(isValidInput(",")); //false
    }
    
    public static boolean isvalidInput(String str){
        
        //if string is empty
        //minimum chars needed. 3 !!!, 2 digits, any string with less than 5 length should return false
        if(str.equals("") || str.length() < 5)
            return false;
            
        
        
        //parse the strings here
        //1. there should be exactly 3 exclamation marks between every pair of numbers
        //2. numbers should add upto 15
        
        //to keep track of numbers and check their addition
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //find all digits in the input string
        //use regex library
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);
        while(m.find()){
            list.add(Integer.parseInt(m.group());
        }
        
        //if numbers dont add upto 15, return false
        for(int i = 0; i < list.size()-1; i+){
            if( list.get(i) + list.get(i+1) != 15){
                return false;
            }
        }
        
        //if numbers add upto 15, parse the input string for exclamation marks char
        String regex = "[a-zA-Z0-9]*![a-zA-Z0-9]*![a-zA-Z0-9]*![a-zA-Z0-9]*";
        for(int j = 0; j < list.size(); j++){
            Pattern patternStr = Pattern.compile(list.get(i).toString() + regex + list.get(i+1).toString());
            Matcher match = patternStr.matcher(str);
            if(!match.find()){
                return false;
            }
            
        }
        return true;
    }
}