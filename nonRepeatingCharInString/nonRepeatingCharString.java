/*
Find the first non-duplicate character in a string. Return null if no unique character is found. 

firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
firstNonRepeatedCharacter( "cbcd" ) --> 'b'
firstNonRepeatedCharacter( "cdcd" ) --> null
*/

public static Character firstNonRepeatedCharacter(String str) {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    int len = str.length();

    for(int i = 0; i < len; i++){
        if(map.containsKey(str.charAt(i))){
            map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }else{
            map.put(str.charAt(i), 1);
        }
    }

    for(int j = 0; j < len; j++){
        if(map.get(str.charAt(j)) == 1){
            return str.charAt(j);
        }
    }
return null;    
}