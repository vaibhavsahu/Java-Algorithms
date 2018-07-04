/*
Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false
*/


public static boolean isIsomorphic(String input1, String input2) {
    //the trick is to keep track of number of characters that are same and that are different in input1 
    //and input2
   if(input1==null||input2==null)
        return false;
 
    if(input1.length()!=input2.length())
        return false;
 
    HashMap<Character, Character> map = new HashMap<Character, Character>();
 
 
    for(int i=0; i<input1.length(); i++){
        char c1 = input1.charAt(i);
        char c2 = input2.charAt(i);
 
        if(map.containsKey(c1)){
            if(map.get(c1)!=c2)// if not consistant with previous ones
                return false;
        }else{
            if(map.containsValue(c2)) //if c2 is already being mapped. Time complexity O(n) here
                return false;
            map.put(c1, c2);
        }
    } 
return true;
}