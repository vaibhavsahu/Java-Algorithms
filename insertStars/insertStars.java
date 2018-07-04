//Given a string, recursively compute a new string where the identical adjacent characters in the original string are separated by a "*".

public static String insertPairStar(String s) {
     if (s == null){
         return null;

     }
     if(s.length() == 1){
         return s;

     }
     char [] charArr = s.toCharArray();
     StringBuffer buffer = new StringBuffer();
     for (int i = 0; i < charArr.length-1; i++) {
         if(charArr[i] == charArr[i+1]){
             buffer.append(charArr[i]);
             buffer.append('*');
          } else {
             buffer.append(charArr[i]);
          }
     
      }
    buffer.append(charArr[charArr.length-1]);
 return buffer.toString();
}