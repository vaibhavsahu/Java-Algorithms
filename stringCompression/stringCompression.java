/*
Compress a sorted String by replacing instances of repeated characters with the character followed by the count of the character.


compressString("aaabbbbbcccc") --> a3b5c4
compressString("aabbbbccc") --> a2b4c3
compressString("abc") --> abc

*/


public static String compressString(String text) {
    
    char [] charArr = text.toCharArray();

    StringBuffer buffer = new StringBuffer();
    int n = 0;
    for(int i = 0; i < charArr.length; i++){
        if(i == charArr.length-1){
            buffer.append(charArr[i]);
            if(n>1){
                buffer.append(n+1);
            }
        break;
        }
        if(charArr[i] == charArr[i+1]){
            n++;
            continue;
        } else {
            buffer.append(charArr[i]);
            if(n>1){
            buffer.append(n+1);
            }    
        }
        n = 0;
    }
return buffer.toString();
}