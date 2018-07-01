/*
Coding Challenge

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


public class solution{
    public static void main(String [] args){
        String input = args[1];
        ArrayList<Integer> list = new ArrayList<Integer>();

                Pattern p = Pattern.compile("-?\\d+");
                Matcher m = p.matcher(input);
                while(m.find()){
                    list.add(Integer.parseInt(m.group()));
                }

                for(int i = 0; i < list.size()-1; i = i+2){
                    if(list.get(i) + list.get(i+1) != 15){
                        return false;
                    }
                }

                String regex = "[A-Za-z]*![A-Za-z]*![A-Za-z]*![A-Za-z]*";
                for(int i = 0; i < list.size()-1; i = i+2){
                    Pattern p1 = Pattern.compile(list.get(i).toString() + regex + list.get(i+1).toString());
                    Matcher m1 = p1.matcher(input);
                    if(!m1.find()){
                        return false;
                    }
                }
        return true;        
    }
}